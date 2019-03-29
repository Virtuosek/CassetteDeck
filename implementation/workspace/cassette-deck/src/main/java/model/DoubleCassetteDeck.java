package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class DoubleCassetteDeck extends CassetteDeck {

	private IntegerProperty volumeSlider;
	private ObjectProperty<Deck> deck2;

	public DoubleCassetteDeck(boolean hasRecorder, boolean hasMicrophone, boolean hasSpeakers, boolean hasAutoReverse, boolean hasSongDetection) {
		super(hasRecorder, hasMicrophone, hasSpeakers, hasAutoReverse, hasSongDetection);
		volumeSlider = new SimpleIntegerProperty(0);
		deck2 = new SimpleObjectProperty<Deck>(new Deck());
	}
	
	@Override
	public void turnOn() {
		super.turnOn();
		getDeck2().turnOn();
		System.out.println("The cassette deck is turned on.");
	}
	
	@Override
	public void turnOff() {
		super.turnOff();
		getDeck2().turnOff();
		System.out.println("Power is off.");
	}
	
	public int getVolumeSlider() {
		return volumeSlider.get();
	}
	
	public void setVolumeSlider(int volume) {
		this.volumeSlider.set(volume);;
		System.out.println("The slider is on " + volume + ".");
	}
	
	public IntegerProperty volumeSliderProperty() {
		return volumeSlider;
	}
	
	public Deck getDeck2() {
		return deck2.get();
	}
	
	public void setDeck2(Deck deck2) {
		this.deck2.set(deck2);
	}
	
	public ObjectProperty<Deck> deck2Property() {
		return deck2;
	}
}
