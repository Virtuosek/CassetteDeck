package model;

public abstract class RecordingState implements State {

	private Deck deck;

	public RecordingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void record() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastRewind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastForward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previousSong() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextSong() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetCounter() {
		// TODO Auto-generated method stub
		
	}
}
