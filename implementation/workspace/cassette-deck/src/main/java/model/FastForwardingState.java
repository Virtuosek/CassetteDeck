package model;

public class FastForwardingState implements State {
	
	private Deck deck;
	private double startTime;
	private double endTime;

	public FastForwardingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		deck.getMotor().turnOn();
		deck.getHolder().getCassette().setAtStart(false);
		// TODO Timer
		startTime = System.currentTimeMillis();
		System.out.println("The deck is fast forwarding.");
	}
	
	@Override
	public void exit() {
		deck.getMotor().turnOff();
		// TODO Timer
		endTime = System.currentTimeMillis();
		boolean isAtEnd = deck.getAudioManager().fastForward(endTime - startTime);
		if(isAtEnd) {
			deck.getHolder().getCassette().setAtEnd(true);
		}
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
		System.out.println("The deck must be idle to fast rewind.");
	}

	@Override
	public void fastForward() {
		System.out.println("This button is already pressed.");
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
