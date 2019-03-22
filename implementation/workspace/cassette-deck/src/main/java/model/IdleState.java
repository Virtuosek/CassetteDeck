package model;

public class IdleState implements State {

	private Deck deck;

	public IdleState(Deck deck) {
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
		if(isReadyToGoForward()) {
			deck.setState(deck.getPlayingActiveState());
			System.out.println("The deck is playing.");
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
			deck.setState(deck.getRecordingActiveState());
			System.out.println("The deck is recording.");
		}
	}

	@Override
	public void fastRewind() {
		if(isReadyToRewind()) {
			deck.setState(deck.getFastRewindingState());
			System.out.println("The deck is fast rewinding.");
			// TODO stop at the beginning
		}		
	}

	@Override
	public void fastForward() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getFastForwardingState());
			System.out.println("The deck is fast forwarding.");
			// TODO stop at the end
		}		
	}

	@Override
	public void previousSong() {
		if(isReadyToRewind()) {
			deck.setState(deck.getFastRewindingState());
			System.out.println("Previous song.");
			// TODO stop at previousSong
		}
		
	}

	@Override
	public void nextSong() {
		if(isReadyToGoForward()) {
			deck.setState(deck.getFastForwardingState());
			System.out.println("Next song.");
			// TODO stop at nextSong
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
	