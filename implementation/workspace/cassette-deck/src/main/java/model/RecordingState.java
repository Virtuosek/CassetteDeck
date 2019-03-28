package model;

import java.util.Timer;
import java.util.TimerTask;

public class RecordingState implements State {

	private Deck deck;
	private Timer timer;

	public RecordingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		deck.getHead().engage();
		if(!deck.isOnPause()) {
			launchRecord();
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
			deck.getAudioManager().stopRecord();
			timer.cancel();
			System.out.println("**STOP RECORDING**");
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
		System.out.println("The deck must be idle to play the tape.");
	}
	
	@Override
	public void pause() {
		deck.setOnPause(!deck.isOnPause());
		System.out.println("The pause button has been switched.");
		if(!deck.isOnPause()) {
			launchRecord();
		}
		else {
			deck.getAudioManager().pause();
			timer.cancel();
			System.out.println("The deck is on pause.");
		}
	}
	
	@Override
	public void record() {
		System.out.println("This button is already pressed.");
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
	
	public void launchRecord() {
		deck.getMotor().turnOn();
		deck.getHolder().getCassette().setAtStart(false);
		deck.getAudioManager().record();
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				deck.incrementCounter();
				System.out.println(deck.getCounter());
				if(deck.getAudioManager().isAtEnd()) {
					deck.getHolder().getCassette().setAtEnd(true);
					deck.setState(deck.getIdleState());
					this.cancel();
				}
			}
		}, 1000, 1000);
		System.out.println("**RECORDING**");
	}
}
