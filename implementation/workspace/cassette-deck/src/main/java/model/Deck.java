package model;

public class Deck {

	private int volume;
	private int balance;
	private int recordVolume;
	private int recordBalance;
	private int counter;
	private boolean isAutoReversing;
	private Motor motor;
	private PlayHead head;
	private CassetteHolder holder;
	private DeckControllerState state;
	
	public Deck() {
		this.volume = 0;
		this.balance = 0;
		this.recordVolume = 0;
		this.recordBalance = 0;
		this.counter = 0;
		this.isAutoReversing = false;
		this.motor = new Motor();
		this.head = new PlayHead();
		this.holder = new CassetteHolder();
		this.state = null;
	}
	
	public void play() {
		// TODO
		System.out.println("The deck is playing.");
	}
	
	public void pause() {
		// TODO
		System.out.println("On pause.");
	}
	
	public void fastRewind() {
		// TODO
		System.out.println("The deck is fast rewinding.");
	}
	
	public void fastForward() {
		// TODO
		System.out.println("The deck is fast forwarding.");
	}
	
	public void previousSong() {
		// TODO
		System.out.println("Previous song.");
	}
	
	public void nextSong() {
		// TODO
		System.out.println("Next song.");
	}
	
	public void resetCounter() {
		// TODO
		System.out.println("The counter is reset to zero.");
	}
	
	public void enableAutoReverse() {
		// TODO
		System.out.println("Auto-reverse is enabled.");
	}
	
	public void disableAutoRevers() {
		// TODO
		System.out.println("Auto-reverse is disabled.");
	}
	
	public void record() {
		// TODO
		System.out.println("The deck is recording.");
	}
	
	public void turnVolumeLeft() {
		// TODO
		System.out.println("The volume has been decreased.");
	}
	
	public void turnVolumeRight() {
		// TODO
		System.out.println("The volume has been increased.");
	}
	
	public void turnBalanceLeft() {
		// TODO
		System.out.println("The balance has been turned to left.");
	}
	
	public void turnBalanceRight() {
		// TODO
		System.out.println("The balance has been turned to right.");
	}
	
	public void turnRecordVolumeLeft() {
		// TODO
		System.out.println("The record volume has been decreased.");
	}
	
	public void turnRecordVolumeRight() {
		// TODO
		System.out.println("The record volume has been increased.");
	}
	
	public void turnRecordBalanceLeft() {
		// TODO
		System.out.println("The record balance has been turned to left.");
	}
	
	public void turnRecordBalanceRight() {
		// TODO
		System.out.println("The record balance has been turned to right.");
	}
}
