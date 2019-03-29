package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public abstract class CassetteDeck {

	private ObjectProperty<Deck> deck;
	private BooleanProperty isTurnedOn;
	private BooleanProperty hasRecorder;
	private BooleanProperty hasAutoReverse;
	private BooleanProperty hasSongDetection;
	private ObjectProperty<Device> speakers;
	private ObjectProperty<Device> microphone;
	
	public CassetteDeck(boolean hasRecorder, boolean hasMicrophone, boolean hasSpeakers, boolean hasAutoReverse, boolean hasSongDetection) {
		deck = new SimpleObjectProperty<Deck>(new Deck(hasSpeakers));
		isTurnedOn = new SimpleBooleanProperty(false);
		this.hasRecorder = new SimpleBooleanProperty(hasRecorder);
		this.hasAutoReverse = new SimpleBooleanProperty(hasAutoReverse);
		this.hasSongDetection = new SimpleBooleanProperty(hasSongDetection);
		if(hasSpeakers) {
			speakers = new SimpleObjectProperty<Device>(new Device());
		}
		else {
			speakers = new SimpleObjectProperty<Device>(null);
		}
		if(hasMicrophone) {
			microphone = new SimpleObjectProperty<Device>(new Device());
		}
		else {
			microphone = new SimpleObjectProperty<Device>(null);
		}
	}
	
	public void turnOn() {
		setTurnedOn(true);
		getDeck().turnOn();
	}
	
	public void turnOff() {
		setTurnedOn(false);
		getDeck().turnOff();
	}

	public void plugInputDevice() {
		// TODO
		System.out.println("An input device has been plugged in.");
	}
	
	public void unplugInputDevice() {
		// TODO
		System.out.println("Input device plugged out.");
	}
	
	public void plugOutputDevice() {
		// TODO
		System.out.println("An input device has been plugged in.");
	}
	
	public void unplugOutputDevice() {
		// TODO
		System.out.println("Output device plugged out.");
	}

	public Deck getDeck() {
		return deck.get();
	}
	
	public void setDeck(Deck deck) {
		this.deck.set(deck);
	}
	
	public ObjectProperty<Deck> deckProperty() {
		return deck;
	}

	public boolean isTurnedOn() {
		return isTurnedOn.get();
	}

	public void setTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn.set(isTurnedOn);
	}
	
	public BooleanProperty isTurnedOnProperty() {
		return isTurnedOn;
	}

	public boolean hasRecorder() {
		return hasRecorder.get();
	}

	public void setRecorder(boolean hasRecorder) {
		this.hasRecorder.set(hasRecorder);
	}
	
	public BooleanProperty hasRecorderProperty() {
		return hasRecorder;
	}

	public boolean hasAutoReverse() {
		return hasAutoReverse.get();
	}

	public void setAutoReverse(boolean hasAutoReverse) {
		this.hasAutoReverse.set(hasAutoReverse);
	}
	
	public BooleanProperty hasAutoReverseProperty() {
		return hasAutoReverse;
	}

	public boolean hasSongDetection() {
		return hasSongDetection.get();
	}

	public void setSongDetection(boolean hasSongDetection) {
		this.hasSongDetection.set(hasSongDetection);
	}
	
	public BooleanProperty hasSongDetectionProperty() {
		return hasSongDetection;
	}
	
	public Device getSpeakers() {
		return speakers.get();
	}

	public void setSpeakers(Device speakers) {
		this.speakers.set(speakers);
	}
	
	public ObjectProperty<Device> speakersProperty() {
		return speakers;
	}
	
	public Device getMicrophone() {
		return microphone.get();
	}

	public void setMicrophone(Device microphone) {
		this.microphone.set(microphone);
	}
	
	public ObjectProperty<Device> microphoneProperty() {
		return microphone;
	}
}
