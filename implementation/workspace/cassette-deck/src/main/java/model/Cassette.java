package model;

public class Cassette {

	private boolean isAtStart;
	private boolean isAtEnd;
	
	public Cassette() {
		isAtStart = true;
		isAtEnd = false;
	}

	public boolean isAtStart() {
		return isAtStart;
	}

	public void setAtStart(boolean isAtStart) {
		this.isAtStart = isAtStart;
	}

	public boolean isAtEnd() {
		return isAtEnd;
	}

	public void setAtEnd(boolean isAtEnd) {
		this.isAtEnd = isAtEnd;
	}
}
