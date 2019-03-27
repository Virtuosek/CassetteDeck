package model;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

public class AudioManager {
	
	private MediaPlayer player;
	
	public AudioManager() {
		player = null;
	}
	
	public void loadFile(File songFile) {
		Media media = new Media(songFile.toURI().toString());
		player = new MediaPlayer(media);
	}
	
	public void unloadFile() {
		player = null;
	}
	
	public void play() {
		Status status = player.getStatus();
		if(status == Status.PAUSED
				|| status == Status.READY
				|| status == Status.STOPPED) {
			player.play();
		}
	}
	
	public void stop() {
		player.stop();
	}
	
	public MediaPlayer getMediaPlayer() {
		return player;
	}
}
