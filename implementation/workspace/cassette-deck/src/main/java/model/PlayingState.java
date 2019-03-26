package model;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class PlayingState implements State {

	private Deck deck;

	public PlayingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		deck.getHead().engage();
		if(!deck.isOnPause()) {
			launchPlayback();
		}
		else {
			System.out.println("The deck is on pause.");
		}
	}
	
	@Override
	public void exit() {
		deck.getHead().disengage();
		if(!deck.isOnPause()) {
			deck.getMotor().turnOff();
			// TODO Timer
			System.out.println("**STOP PLAYING**");
		}
	}
	
	@Override
	public void insert(Cassette cassette) {
		System.out.println("The deck must be idle to open the holder.");
	}

	@Override
	public void eject() {
		System.out.println("The deck must be idle to open the holder.");
	}

	@Override
	public void stop() {
		deck.setState(deck.getIdleState());
	}
	
	@Override
	public void play() {
		System.out.println("This button is already pressed.");
	}
	
	@Override
	public void pause() {
		deck.setOnPause(!deck.isOnPause());
		System.out.println("The pause button has been switched.");
		if(!deck.isOnPause()) {
			launchPlayback();
		}
		else {
			System.out.println("The deck is on pause.");
		}
	}
	
	@Override
	public void record() {
		System.out.println("The deck must be idle to launch a recording.");
	}

	@Override
	public void fastRewind() {
		System.out.println("The deck must be idle to fast rewind.");
	}

	@Override
	public void fastForward() {
		System.out.println("The deck must be idle to fast forward.");
	}

	@Override
	public void previousSong() {
		System.out.println("The deck must be idle to go back to the previous song.");
	}

	@Override
	public void nextSong() {
		System.out.println("The deck must be idle to go to the next song.");
	}

	@Override
	public void resetCounter() {
		System.out.println("The deck must be idle to reset the counter.");
	}
	
	public void launchPlayback() {
		deck.getMotor().turnOn();
		deck.getHolder().getCassette().setAtStart(false);
		new Thread() {
			public void run() {
				try {
					Player p = new Player(new FileInputStream(deck.getHolder().getCassette().getSongFile())); //loads song into player
					p.play();
				} catch (Exception e) {
					System.out.println(e.getCause());
				}
			}
		}.start();
		// TODO Timer
		System.out.println("**PLAYING**");
	}
}
