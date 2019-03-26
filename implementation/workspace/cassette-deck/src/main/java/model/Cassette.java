package model;

import java.io.File;

public class Cassette {

	private boolean isAtStart;
	private boolean isAtEnd;
	private File songFile;
	
	public Cassette(File songFile) {
		isAtStart = true;
		isAtEnd = false;
		this.songFile = songFile;
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

	public File getSongFile() {
		return songFile;
	}
}
