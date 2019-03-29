package model;

import java.io.File;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Cassette {

	private BooleanProperty isAtStart;
	private BooleanProperty isAtEnd;
	private ObjectProperty<File> songFile;
	
	public Cassette(File songFile) {
		isAtStart = new SimpleBooleanProperty(true);
		isAtEnd = new SimpleBooleanProperty(false);
		this.songFile = new SimpleObjectProperty<File>(songFile);
	}

	public boolean isAtStart() {
		return isAtStart.get();
	}

	public void setAtStart(boolean isAtStart) {
		this.isAtStart.set(isAtStart);;
	}
	
	public BooleanProperty isAtStartProperty() {
		return isAtStart;
	}

	public boolean isAtEnd() {
		return isAtEnd.get();
	}
	
	public void setAtEnd(boolean isAtEnd) {
		this.isAtEnd.set(isAtEnd);
	}
	
	public BooleanProperty isAtEndProperty() {
		return isAtEnd;
	}
	
	public File getSongFile() {
		return songFile.get();
	}
	
	public void setSongFile(File songFile) {
		this.songFile.set(songFile);
	}
}
