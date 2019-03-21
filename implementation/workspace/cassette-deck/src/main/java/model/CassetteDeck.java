package model;

public class CassetteDeck {

	private int volume;
	private Deck deck;
	private boolean isTurnedOn;
	
	public CassetteDeck() {
		volume = 0;
		deck = new Deck();
		isTurnedOn = false;
	}
	
	public void turnOn() {
		isTurnedOn = true;
		System.out.println("The cassette deck is turned on.");
	}
	
	public void turnOff() {
		isTurnedOn = false;
		System.out.println("Power is off.");
	}
	
	public void adjustVolumeSlider(int volume) {
		this.volume = volume;
		System.out.println("The slider is on " + volume + ".");
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
}
