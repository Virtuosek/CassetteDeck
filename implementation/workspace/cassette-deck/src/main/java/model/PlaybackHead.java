package model;

public class PlaybackHead {

	private boolean isEngaged;
	
	public PlaybackHead() {
		isEngaged = false;
	}
	
	public void engage() {
		isEngaged = true;
		System.out.println("The play head has been engaged.");
	}
	
	public void disengage() {
		isEngaged = false;
		System.out.println("The play head is disengaged.");
	}
}
