package model;

public abstract class CassetteDeck {

	private Deck deck;
	private boolean isTurnedOn;
	private boolean hasRecorder;
	private boolean hasMicrophone;
	private boolean hasSpeakers;
	private boolean hasAutoReverse;
	private boolean hasSongDetection;
	
	public CassetteDeck(boolean hasRecorder, boolean hasMicrophone, boolean hasSpeakers, boolean hasAutoReverse, boolean hasSongDetection) {
		deck = new Deck();
		isTurnedOn = false;
		this.hasRecorder = hasRecorder;
		this.hasMicrophone = hasMicrophone;
		this.hasSpeakers = hasSpeakers;
		this.hasAutoReverse = hasAutoReverse;
		this.hasSongDetection = hasSongDetection;
	}
	
	public void turnOn() {
		isTurnedOn = true;
		deck.turnOn();
	}
	
	public void turnOff() {
		isTurnedOn = false;
		deck.turnOff();
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
		return deck;
	}

	public boolean isTurnedOn() {
		return isTurnedOn;
	}

	public void setTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}

	public boolean hasRecorder() {
		return hasRecorder;
	}

	public void setRecorder(boolean hasRecorder) {
		this.hasRecorder = hasRecorder;
	}

	public boolean hasMicrophone() {
		return hasMicrophone;
	}

	public void setMicrophone(boolean hasMicrophone) {
		this.hasMicrophone = hasMicrophone;
	}

	public boolean hasSpeakers() {
		return hasSpeakers;
	}

	public void setSpeakers(boolean hasSpeakers) {
		this.hasSpeakers = hasSpeakers;
	}

	public boolean hasAutoReverse() {
		return hasAutoReverse;
	}

	public void setAutoReverse(boolean hasAutoReverse) {
		this.hasAutoReverse = hasAutoReverse;
	}

	public boolean hasSongDetection() {
		return hasSongDetection;
	}

	public void setSongDetection(boolean hasSongDetection) {
		this.hasSongDetection = hasSongDetection;
	}

	@Override
	public String toString() {
		return "CassetteDeck [deck=" + deck + ", isTurnedOn=" + isTurnedOn + ", hasRecorder=" + hasRecorder
				+ ", hasMicrophone=" + hasMicrophone + ", hasSpeakers=" + hasSpeakers + ", hasAutoReverse="
				+ hasAutoReverse + ", hasSongDetection=" + hasSongDetection + "]";
	}
}
