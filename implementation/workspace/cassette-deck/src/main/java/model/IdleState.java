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
	public void open() {
		deck.getHolder().open();
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
	}

	@Override
	public void fastRewind() {
		if(isReadyToRewind()) {
			deck.setState(deck.getFastRewindingState());
		}		
	}

	@Override
	public void fastForward() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getFastForwardingState());
		}		
	}

	@Override
	public void previousSong() {
		if(isReadyToRewind()) {
			deck.setState(deck.getFastRewindingState());
			deck.setChangingSong(true);
		}
	}

	@Override
	public void nextSong() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getFastForwardingState());
			deck.setChangingSong(true);
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
	