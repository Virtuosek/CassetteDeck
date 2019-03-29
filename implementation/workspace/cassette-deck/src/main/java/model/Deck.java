package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import tools.AudioManager;
import tools.Status;

public class Deck {

	private IntegerProperty volume;
	private IntegerProperty balance;
	private IntegerProperty recordVolume;
	private IntegerProperty recordBalance;
	private IntegerProperty counter;
	private BooleanProperty isAutoReversing;
	private BooleanProperty isOnPause;
	private BooleanProperty isChangingSong;
	private ObjectProperty<Motor> motor;
	private ObjectProperty<PlaybackHead> head;
	private ObjectProperty<CassetteHolder> holder;
	private ObjectProperty<AudioManager> audioManager;
	private ObjectProperty<Status> status;
	
	private State offState;
	private State idleState;
	private State playingState;
	private State recordingState;
	private State fastRewindingState;
	private State fastForwardingState;
	private State state;
	
	public Deck(boolean hasSpeakers) {
		volume = new SimpleIntegerProperty(0);
		balance = new SimpleIntegerProperty(0);
		recordVolume = new SimpleIntegerProperty(0);
		recordBalance = new SimpleIntegerProperty(0);
		counter = new SimpleIntegerProperty(0);
		isAutoReversing = new SimpleBooleanProperty(false);
		isOnPause = new SimpleBooleanProperty(false);
		isChangingSong = new SimpleBooleanProperty(false);
		motor = new SimpleObjectProperty<Motor>(new Motor());
		head = new SimpleObjectProperty<PlaybackHead>(new PlaybackHead());
		holder = new SimpleObjectProperty<CassetteHolder>(new CassetteHolder());
		audioManager = new SimpleObjectProperty<AudioManager>(new AudioManager(hasSpeakers));
		status = new SimpleObjectProperty<Status>(Status.OFF);
		
		offState = new OffState(this);
		idleState = new IdleState(this);
		playingState = new PlayingState(this);
		recordingState = new RecordingState(this);
		fastRewindingState = new FastRewindingState(this);
		fastForwardingState = new FastForwardingState(this);
		state = offState;
	}
	
	public void turnOn() {
		setState(idleState);
	}
	
	public void turnOff() {
		setState(offState);
	}
	
	public void eject() {
		state.eject();
	}
	
	public void insert(Cassette cassette) {
		state.insert(cassette);
	}
	
	public void stop() {
		state.stop();
	}
	
	public void play() {
		state.play();
	}
	
	public void pause() {
		state.pause();
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
	
	public void incrementCounter() {
		counter.set(counter.get() + 1);
	}
	
	public void decrementCounter() {
		counter.set(counter.get() - 1);
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
		volume.set(volume.get() - 1);
		System.out.println("The volume has been decreased.");
	}
	
	public void turnVolumeRight() {
		volume.set(volume.get() + 1);
		System.out.println("The volume has been increased.");
	}
	
	public void turnBalanceLeft() {
		balance.set(balance.get() - 1);
		System.out.println("The balance has been turned to left.");
	}
	
	public void turnBalanceRight() {
		balance.set(balance.get() + 1);
		System.out.println("The balance has been turned to right.");
	}
	
	public void turnRecordVolumeLeft() {
		recordVolume.set(recordVolume.get() - 1);
		System.out.println("The record volume has been decreased.");
	}
	
	public void turnRecordVolumeRight() {
		recordVolume.set(recordVolume.get() + 1);
		System.out.println("The record volume has been increased.");
	}
	
	public void turnRecordBalanceLeft() {
		recordBalance.set(recordBalance.get() - 1);
		System.out.println("The record balance has been turned to left.");
	}
	
	public void turnRecordBalanceRight() {
		recordBalance.set(recordBalance.get() + 1);
		System.out.println("The record balance has been turned to right.");
	}
	
	
	
	

	public int getVolume() {
		return volume.get();
	}

	public void setVolume(int volume) {
		this.volume.set(volume);
	}
	
	public IntegerProperty volumeProperty() {
		return volume;
	}

	public int getBalance() {
		return balance.get();
	}

	public void setBalance(int balance) {
		this.balance.set(balance);
	}
	
	public IntegerProperty balanceProperty() {
		return balance;
	}

	public int getRecordVolume() {
		return recordVolume.get();
	}

	public void setRecordVolume(int recordVolume) {
		this.recordVolume.set(recordVolume);
	}
	
	public IntegerProperty recordVolumeProperty() {
		return recordVolume;
	}

	public int getRecordBalance() {
		return recordBalance.get();
	}

	public void setRecordBalance(int recordBalance) {
		this.recordBalance.set(recordBalance);
	}
	
	public IntegerProperty recordBalanceProperty() {
		return recordBalance;
	}

	public int getCounter() {
		return counter.get();
	}

	public void setCounter(int counter) {
		this.counter.set(counter);
	}

	public IntegerProperty counterProperty() {
		return counter;
	}
	
	public boolean isAutoReversing() {
		return isAutoReversing.get();
	}

	public void setAutoReversing(boolean isAutoReversing) {
		this.isAutoReversing.set(isAutoReversing);
	}
	
	public BooleanProperty isAutoReversingProperty() {
		return isAutoReversing;
	}

	public boolean isOnPause() {
		return isOnPause.get();
	}
	
	public void setOnPause(boolean isOnPause) {
		this.isOnPause.set(isOnPause);
	}
	
	public BooleanProperty isOnPauseProperty() {
		return isOnPause;
	}
	
	public boolean isChangingSong() {
		return isChangingSong.get();
	}
	
	public void setChangingSong(boolean isChangingSong) {
		this.isChangingSong.set(isChangingSong);
	}
	
	public BooleanProperty isChangingSongProperty() {
		return isChangingSong;
	}
	
	public Motor getMotor() {
		return motor.get();
	}

	public void setMotor(Motor motor) {
		this.motor.set(motor);
	}

	public ObjectProperty<Motor> motorProperty() {
		return motor;
    }
	
	public PlaybackHead getHead() {
		return head.get();
	}

	public void setHead(PlaybackHead head) {
		this.head.set(head);
	}
	
	public ObjectProperty<PlaybackHead> headProperty() {
		return head;
	}
	
	public CassetteHolder getHolder() {
		return holder.get();
	}

	public void setHolder(CassetteHolder holder) {
		this.holder.set(holder);
	}
	
	public ObjectProperty<CassetteHolder> holderProperty() {
		return holder;
	}
	
	public AudioManager getAudioManager() {
		return audioManager.get();
	}
	
	public void setAudioManager(AudioManager audioManager) {
		this.audioManager.set(audioManager);
	}
	
	public ObjectProperty<AudioManager> audioManagerProperty() {
		return audioManager;
	}
	
	public Status getStatus() {
		return status.get();
	}
	
	public void setStatus(Status status) {
		this.status.set(status);
	}
	
	public ObjectProperty<Status> statusProperty() {
		return status;
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
