package model;

public class IdleState implements State {

	private Deck deck;

	public IdleState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		System.out.println("The deck is idle.");
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
			System.out.println("The cassette has been ejected.");
		}
		else {
			System.out.println("There is no cassette in the holder.");
		}
	}

	@Override
	public void stop() {	
		System.out.println("This button is already pressed.");
	}
	
	@Override
	public void play() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getPlayingState());
		}
		else {
	        System.out.println("There has to be a cassette in the holder, and this cassette shouldn't be at the end of its tape.");
		}
	}
	
	@Override
	public void pause() {
		deck.setOnPause(!deck.isOnPause());
		System.out.println("The pause button has been switched.");
	}
	
	@Override
	public void record() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getRecordingState());
		}
		else {
	        System.out.println("There has to be a cassette in the holder, and this cassette shouldn't be at the end of its tape.");
		}
	}

	@Override
	public void fastRewind() {
		if(isReadyToRewind()) {
			deck.setState(deck.getFastRewindingState());
		}
		else {
	        System.out.println("There has to be a cassette in the holder, and this cassette shouldn't be at the beginning of its tape.");
		}
	}

	@Override
	public void fastForward() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getFastForwardingState());
		}		
		else {
	        System.out.println("There has to be a cassette in the holder, and this cassette shouldn't be at the end of its tape.");
		}
	}

	@Override
	public void previousSong() {
		if(isReadyToRewind()) {
			deck.setState(deck.getFastRewindingState());
			deck.setChangingSong(true);
		}
		else {
	        System.out.println("There has to be a cassette in the holder, and this cassette shouldn't be at the end of its tape.");
		}
	}

	@Override
	public void nextSong() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getFastForwardingState());
			deck.setChangingSong(true);
		}
		else {
	        System.out.println("There has to be a cassette in the holder, and this cassette shouldn't be at the end of its tape.");
		}
	}

	@Override
	public void resetCounter() {
		deck.setCounter(0);
		System.out.println("The counter is reset to zero.");
	}
	
	public boolean isReadyToGoForward() {
		CassetteHolder holder = deck.getHolder();
		return !holder.isOpen() && holder.hasCassette() && !holder.getCassette().isAtEnd();
	}
	
	public boolean isReadyToRewind() {
		CassetteHolder holder = deck.getHolder();
		return !holder.isOpen() && holder.hasCassette() && !holder.getCassette().isAtStart();
	}
}
	