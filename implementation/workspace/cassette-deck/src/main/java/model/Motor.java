package model;

public class Motor {
	
	private boolean isTurnedOn;
	
	public Motor() {
		isTurnedOn = false;
	}
	
	public void turnOn() {
		isTurnedOn = true;
	}
	
	public void turnOff() {
		isTurnedOn = false;
	}
}
