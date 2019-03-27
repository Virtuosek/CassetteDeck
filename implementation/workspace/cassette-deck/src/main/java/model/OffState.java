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
	public void insert(Cassette cassette) {
		deck.getHolder().open();
		boolean isInserted = deck.getHolder().putCassette(cassette);
		deck.getHolder().close();
		if(isInserted) {
			System.out.println("A new cassette has been inserted.");
			deck.getAudioManager().loadFile(cassette.getSongFile());
			System.out.println("The audio has been loaded");
		}
		else {
			System.out.println("There's already a cassette in the holder.");
		}
	}

	@Override
	public void eject() {
		deck.getHolder().open();
		boolean isEjected = deck.getHolder().removeCassette();
		deck.getHolder().close();
		if(isEjected) {
			deck.getAudioManager().unloadFile();
			System.out.println("The cassette has been ejected.");
		}
		else {
			System.out.println("There is no cassette in the holder.");
		}
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
