package model;

public class PlayHead {

	private boolean isEngaged;
	
	public PlayHead() {
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
