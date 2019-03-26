package model;

public class FastRewindingState implements State {

	private Deck deck;
	
	public FastRewindingState(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void entry() {
		deck.getMotor().turnOn();
		deck.getHolder().getCassette().setAtEnd(false);
		// TODO Timer
		System.out.println("The deck is fast rewinding.");
	}
	
	@Override
	public void exit() {
		deck.getMotor().turnOff();
		// TODO Timer
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
