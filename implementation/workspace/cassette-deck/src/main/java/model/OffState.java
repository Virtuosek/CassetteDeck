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
		System.out.println("The cassette deck is off.");
	}
	
	@Override
	public void play() {
		System.out.println("The cassette deck is off.");
	}
	
	@Override
	public void pause() {
		deck.setOnPause(!deck.isOnPause());
		System.out.println("The pause button has been switched.");
	}
	
	@Override
	public void record() {
		System.out.println("The cassette deck is off.");
	}

	@Override
	public void fastRewind() {
		System.out.println("The cassette deck is off.");
	}

	@Override
	public void fastForward() {
		System.out.println("The cassette deck is off.");
	}

	@Override
	public void previousSong() {
		System.out.println("The cassette deck is off.");
	}

	@Override
	public void nextSong() {
		System.out.println("The cassette deck is off.");
	}

	@Override
	public void resetCounter() {
		System.out.println("The cassette deck is off.");
	}
}
