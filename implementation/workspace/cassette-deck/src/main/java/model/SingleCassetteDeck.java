package model;

public class SingleCassetteDeck extends CassetteDeck {

	public SingleCassetteDeck(boolean hasRecorder, boolean hasMicrophone, boolean hasSpeakers, boolean hasAutoReverse, boolean hasSongDetection) {
		super(hasRecorder, hasMicrophone, hasSpeakers, hasAutoReverse, hasSongDetection);
	}
	
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("The cassette deck is turned on.");
	}
	
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("Power is off.");
	}
}
