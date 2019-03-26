package model;

public class DoubleCassetteDeck extends CassetteDeck {

	private int volumeSlider;
	private Deck deck2;

	public DoubleCassetteDeck(boolean hasRecorder, boolean hasMicrophone, boolean hasSpeakers, boolean hasAutoReverse, boolean hasSongDetection) {
		super(hasRecorder, hasMicrophone, hasSpeakers, hasAutoReverse, hasSongDetection);
		deck2 = new Deck();
		volumeSlider = 0;
	}
	
	public void adjustVolumeSlider(int volume) {
		this.volumeSlider = volume;
		System.out.println("The slider is on " + volume + ".");
	}
}
