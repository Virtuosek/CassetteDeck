package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public abstract class CassetteDeck {

	private ObjectProperty<Deck> deck;
	private BooleanProperty isTurnedOn;
	private BooleanProperty hasRecorder;
	private BooleanProperty hasMicrophone;
	private BooleanProperty hasSpeakers;
	private BooleanProperty hasAutoReverse;
	private BooleanProperty hasSongDetection;
	
	public CassetteDeck(boolean hasRecorder, boolean hasMicrophone, boolean hasSpeakers, boolean hasAutoReverse, boolean hasSongDetection) {
		deck = new SimpleObjectProperty<Deck>(new Deck());
		isTurnedOn = new SimpleBooleanProperty(false);
		this.hasRecorder = new SimpleBooleanProperty(hasRecorder);
		this.hasMicrophone = new SimpleBooleanProperty(hasMicrophone);
		this.hasSpeakers = new SimpleBooleanProperty(hasSpeakers);
		this.hasAutoReverse = new SimpleBooleanProperty(hasAutoReverse);
		this.hasSongDetection = new SimpleBooleanProperty(hasSongDetection);
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

	public boolean hasMicrophone() {
		return hasMicrophone.get();
	}

	public void setMicrophone(boolean hasMicrophone) {
		this.hasMicrophone.set(hasMicrophone);
	}

	public boolean hasSpeakers() {
		return hasSpeakers.get();
	}

	public void setSpeakers(boolean hasSpeakers) {
		this.hasSpeakers.set(hasSpeakers);
	}
	
	public BooleanProperty hasSpeakersProperty() {
		return hasSpeakers;
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

	@Override
	public String toString() {
		return "CassetteDeck [deck=" + deck + ", isTurnedOn=" + isTurnedOn + ", hasRecorder=" + hasRecorder
				+ ", hasMicrophone=" + hasMicrophone + ", hasSpeakers=" + hasSpeakers + ", hasAutoReverse="
				+ hasAutoReverse + ", hasSongDetection=" + hasSongDetection + "]";
	}
}
