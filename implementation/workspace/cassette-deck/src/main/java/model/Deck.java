package model;

public class Deck {

	private int volume;
	private int balance;
	private int recordVolume;
	private int recordBalance;
	private int counter;
	private boolean isAutoReversing;
	private boolean isOnPause;
	private Motor motor;
	private PlayHead head;
	private CassetteHolder holder;
	
	private State offState;
	private State idleState;
	private State playingActiveState;
	private State playingPauseState;
	private State recordingActiveState;
	private State recordingPauseState;
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
		motor = new Motor();
		head = new PlayHead();
		holder = new CassetteHolder();
		
		offState = new OffState(this);
		idleState = new IdleState(this);
		playingActiveState = new PlayingActiveState(this);
		playingPauseState = new PlayingPauseState(this);
		recordingActiveState = new RecordingActiveState(this);
		recordingPauseState = new RecordingPauseState(this);
		fastRewindingState = new FastRewindingState(this);
		fastForwardingState = new FastForwardingState(this);
		
		state = offState;
	}
	
	public void turnOn() {
		// TODO not in states
	}
	
	public void turnOff() {
		// TODO not in states
	}
	
	public void open() {
		state.open();
	}

	public void close() {
		// TODO not in states
	}
	
	public void insertCassette() {
		// TODO not in states
	}
	public void removeCassette() {
		// TODO not in states
	}
	
	public void stop() {
		state.stop();
	}
	
	public void play() {
		state.play();
	}
	
	public void pause() {
		// TODO not in states
		System.out.println("The pause button has been switched.");
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
		// TODO not in states
		System.out.println("Auto-reverse is enabled.");
	}
	
	public void disableAutoReverse() {
		// TODO not in states
		System.out.println("Auto-reverse is disabled.");
	}
	
	public void turnVolumeLeft() {
		// TODO not in states
		System.out.println("The volume has been decreased.");
	}
	
	public void turnVolumeRight() {
		// TODO not in states
		System.out.println("The volume has been increased.");
	}
	
	public void turnBalanceLeft() {
		// TODO not in states
		System.out.println("The balance has been turned to left.");
	}
	
	public void turnBalanceRight() {
		// TODO not in states
		System.out.println("The balance has been turned to right.");
	}
	
	public void turnRecordVolumeLeft() {
		// TODO not in states
		System.out.println("The record volume has been decreased.");
	}
	
	public void turnRecordVolumeRight() {
		// TODO not in states
		System.out.println("The record volume has been increased.");
	}
	
	public void turnRecordBalanceLeft() {
		// TODO not in states
		System.out.println("The record balance has been turned to left.");
	}
	
	public void turnRecordBalanceRight() {
		// TODO not in states
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

	public State getPlayingActiveState() {
		return playingActiveState;
	}

	public State getPlayingPauseState() {
		return playingPauseState;
	}

	public State getRecordingActiveState() {
		return recordingActiveState;
	}

	public State getRecordingPauseState() {
		return recordingPauseState;
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
