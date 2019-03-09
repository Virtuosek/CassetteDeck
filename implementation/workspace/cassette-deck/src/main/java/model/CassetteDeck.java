package model;

public class CassetteDeck {

	private int volume;
	private Deck deck;
	private boolean isTurnedOn;
	
	public CassetteDeck() {
		this.volume = 0;
		this.deck = new Deck();
		this.isTurnedOn = false;
	}
	
	public void switchPower() {
		this.isTurnedOn = !isTurnedOn;
	}
	
	public void adjustVolumeSlider(int volume) {
		this.volume = volume;
	}
	
	public void plugInputDevice() {
		
	}
	
	public void unplugInputDevice() {
		
	}
	
	public void plugOutputDevice() {
		
	}
	
	public void unplugOutputDevice() {
		
	}
}
