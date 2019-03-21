package model;

public interface State {
	
	public void turnOn();
	public void turnOff();
	public void open();
	public void stop();
	public void play();
	public void pause();
	public void record();
	public void fastRewind();
	public void fastForward();
	public void previousSong();
	public void nextSong();
	public void resetCounter();
}
