package model;

public class PlayHead {

	private boolean engaged;
	
	public PlayHead() {
		this.engaged = false;
	}
	
	public void engage() {
		this.engaged = true;
	}
	
	public void disengage() {
		this.engaged = false;
	}
}
