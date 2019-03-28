package model;

import java.util.Timer;
import java.util.TimerTask;

import tools.Start;

public class FastRewindingState implements State {

	private Deck deck;
	private Timer timer;
	private double currentTime;
	private double lastTime;
	
	public FastRewindingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		deck.getMotor().turnOn();
		deck.getHolder().getCassette().setAtEnd(false);
		long speed = (long) (1000 / Start.FAST_PLAYBACK_SPEED_FACTOR);
		currentTime = System.currentTimeMillis();
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				deck.decrementCounter();
				System.out.println(deck.getCounter());
				lastTime = currentTime;
				currentTime = System.currentTimeMillis();
				if(deck.getAudioManager().fastRewind(currentTime - lastTime)) {
					deck.getHolder().getCassette().setAtStart(true);
					deck.setState(deck.getIdleState());
					this.cancel();
				}
			}
		}, speed, speed);
		System.out.println("The deck is fast rewinding.");
	}
	
	@Override
	public void exit() {
		deck.getMotor().turnOff();
		timer.cancel();
		deck.setChangingSong(false);
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
	}
	
	@Override
	public void record() {
		System.out.println("The deck must be idle to launch a recording.");		
	}

	@Override
	public void fastRewind() {
		System.out.println("This button is already pressed.");		
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
}
