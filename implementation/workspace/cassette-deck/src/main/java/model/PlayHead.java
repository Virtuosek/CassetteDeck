package model;

public class PlayHead {

	private boolean isEngaged;
	
	public PlayHead() {
		isEngaged = false;
	}
	
	public void engage() {
		isEngaged = true;
	}
	
	public void disengage() {
		isEngaged = false;
	}
}
