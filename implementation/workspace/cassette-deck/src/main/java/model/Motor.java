package model;

public class Motor {
	
	private boolean isTurnedOn;
	
	public Motor() {
		isTurnedOn = false;
	}
	
	public void turnOn() {
		isTurnedOn = true;
		System.out.println("The motor is turned on.");
	}
	
	public void turnOff() {
		isTurnedOn = false;
		System.out.println("The motor is off.");
	}
}
