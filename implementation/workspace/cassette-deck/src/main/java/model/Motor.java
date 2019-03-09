package model;

public class Motor {
	
	private boolean isTurnedOn;
	
	public Motor() {
		this.isTurnedOn = false;
	}
	
	public void switchPower() {
		this.isTurnedOn = !isTurnedOn;
	}
}
