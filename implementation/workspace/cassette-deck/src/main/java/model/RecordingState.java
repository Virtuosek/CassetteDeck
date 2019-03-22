package model;

public class RecordingState implements State {

	private Deck deck;

	public RecordingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		
	}
	
	@Override
	public void exit() {
		
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
		deck.setOnPause(!deck.isOnPause());
		System.out.println("The pause button has been switched.");
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
