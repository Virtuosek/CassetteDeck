package model;

public class OffState implements State {

	private Deck deck;
	
	public OffState(Deck deck) {
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
		deck.getHolder().open();
	}

	@Override
	public void stop() {
		
	}
	
	@Override
	public void play() {
		
	}
	
	@Override
	public void pause() {
		deck.setOnPause(!deck.isOnPause());
		System.out.println("The pause button has been switched.");
	}
	
	@Override
	public void record() {
		
	}

	@Override
	public void fastRewind() {
		
	}

	@Override
	public void fastForward() {
		
	}

	@Override
	public void previousSong() {
		
	}

	@Override
	public void nextSong() {
		
	}

	@Override
	public void resetCounter() {
		
	}
}
