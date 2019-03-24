package model;

public class Deck {

	private int volume;
	private int balance;
	private int recordVolume;
	private int recordBalance;
	private int counter;
	private boolean isAutoReversing;
	private boolean isOnPause;
	private boolean isChangingSong;
	private Motor motor;
	private PlayHead head;
	private CassetteHolder holder;
	
	private State offState;
	private State idleState;
	private State playingState;
	private State recordingState;
	private State fastRewindingState;
	private State fastForwardingState;
	
	private State state;
	
	public Deck() {
		volume = 0;
		balance = 0;
		recordVolume = 0;
		recordBalance = 0;
		counter = 0;
		isAutoReversing = false;
		isOnPause = false;
		isChangingSong = false;
		motor = new Motor();
		head = new PlayHead();
		holder = new CassetteHolder();
		
		offState = new OffState(this);
		idleState = new IdleState(this);
		playingState = new PlayingState(this);
		recordingState = new RecordingState(this);
		fastRewindingState = new FastRewindingState(this);
		fastForwardingState = new FastForwardingState(this);
		
		state = offState;
	}
	
	public void turnOn() {
		state = idleState;
	}
	
	public void turnOff() {
		state = offState;
	}
	
	public void open() {
		state.open();
	}

	public void close() {
		holder.close();
	}
	
	public void insertCassette(Cassette cassette) {
		if(holder.isOpen() && !holder.hasCassette()) {
			holder.insertCassette(cassette);
		}
	}
	
	public void removeCassette() {
		if(holder.isOpen()) {
			holder.removeCassette();
		}
	}
	
	public void stop() {
		state.stop();
	}
	
	public void play() {
		state.play();
	}
	
	public void record() {
		state.record();
	}
	
	public void fastRewind() {
		state.fastRewind();
	}
	
	public void fastForward() {
		state.fastForward();
	}
	
	public void previousSong() {
		state.previousSong();
	}
	
	public void nextSong() {
		state.nextSong();
	}
	
	public void resetCounter() {
		state.resetCounter();
	}
	
	public void enableAutoReverse() {
		setAutoReversing(true);
		System.out.println("Auto-reverse is enabled.");
	}
	
	public void disableAutoReverse() {
		setAutoReversing(false);
		System.out.println("Auto-reverse is disabled.");
	}
	
	public void turnVolumeLeft() {
		volume--;
		System.out.println("The volume has been decreased.");
	}
	
	public void turnVolumeRight() {
		volume++;
		System.out.println("The volume has been increased.");
	}
	
	public void turnBalanceLeft() {
		balance--;
		System.out.println("The balance has been turned to left.");
	}
	
	public void turnBalanceRight() {
		balance++;
		System.out.println("The balance has been turned to right.");
	}
	
	public void turnRecordVolumeLeft() {
		recordVolume--;
		System.out.println("The record volume has been decreased.");
	}
	
	public void turnRecordVolumeRight() {
		recordVolume++;
		System.out.println("The record volume has been increased.");
	}
	
	public void turnRecordBalanceLeft() {
		recordBalance--;
		System.out.println("The record balance has been turned to left.");
	}
	
	public void turnRecordBalanceRight() {
		recordBalance++;
		System.out.println("The record balance has been turned to right.");
	}
	
	
	
	

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getRecordVolume() {
		return recordVolume;
	}

	public void setRecordVolume(int recordVolume) {
		this.recordVolume = recordVolume;
	}

	public int getRecordBalance() {
		return recordBalance;
	}

	public void setRecordBalance(int recordBalance) {
		this.recordBalance = recordBalance;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean isAutoReversing() {
		return isAutoReversing;
	}

	public void setAutoReversing(boolean isAutoReversing) {
		this.isAutoReversing = isAutoReversing;
	}

	public boolean isOnPause() {
		return isOnPause;
	}
	
	public void setOnPause(boolean isOnPause) {
		this.isOnPause = isOnPause;
	}
	
	public boolean isChangingSong() {
		return isChangingSong;
	}
	
	public void setChangingSong(boolean isChangingSong) {
		this.isChangingSong = isChangingSong;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public PlayHead getHead() {
		return head;
	}

	public void setHead(PlayHead head) {
		this.head = head;
	}

	public CassetteHolder getHolder() {
		return holder;
	}

	public void setHolder(CassetteHolder holder) {
		this.holder = holder;
	}

	public State getOffState() {
		return offState;
	}

	public State getIdleState() {
		return idleState;
	}

	public State getPlayingState() {
		return playingState;
	}

	public State getRecordingState() {
		return recordingState;
	}

	public State getFastRewindingState() {
		return fastRewindingState;
	}

	public State getFastForwardingState() {
		return fastForwardingState;
	}

	public void setState(State state) {
		this.state.exit();
		this.state = state;
		this.state.entry();
	}
	
	public State getState() {
		return state;
	}
}
