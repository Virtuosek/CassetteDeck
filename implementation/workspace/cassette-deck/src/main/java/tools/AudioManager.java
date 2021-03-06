package tools;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class AudioManager {

    private MediaPlayer player;
    private boolean hasSpeakers;

    public AudioManager(boolean hasSpeakers) {
        player = null;
        this.hasSpeakers = hasSpeakers;
    }

    public void loadFile(File songFile) {
        Media media = new Media(songFile.toURI().toString());
        player = new MediaPlayer(media);
        if (!hasSpeakers) {
            player.setMute(true);
        }
    }

    public void unloadFile() {
        player = null;
    }

    public void play() {
        player.play();
    }

    public void stop() {
        player.stop();
    }

    public void pause() {
        player.pause();
    }

    public boolean fastRewind(double fastRewindingTime) {
        Duration timeToAdd = new Duration(fastRewindingTime * Start.FAST_PLAYBACK_SPEED_FACTOR);
        Duration seekTime = player.getCurrentTime().subtract(timeToAdd);
        if (seekTime.lessThanOrEqualTo(Duration.ZERO)) {
            player.stop();
            return true;
        }
        player.seek(seekTime);
        return false;
    }

    public boolean fastForward(double fastForwardingTime) {
        Duration timeToAdd = new Duration(fastForwardingTime * Start.FAST_PLAYBACK_SPEED_FACTOR);
        Duration seekTime = player.getCurrentTime().add(timeToAdd);
        if (seekTime.greaterThanOrEqualTo(player.getStopTime())) {
            player.seek(player.getStopTime());
            return true;
        }
        player.seek(seekTime);
        return false;
    }

    public void record() {
        if (hasSpeakers) {
            player.setMute(true);
        }
        player.play();
    }

    public void stopRecord() {
        if (hasSpeakers) {
            player.setMute(false);
        }
        player.pause();
    }

    public boolean isAtEnd() {
        return player.getCurrentTime().greaterThanOrEqualTo(player.getStopTime());
    }

    public double getProgress() {
        return player.getCurrentTime().toMillis() / player.getStopTime().toMillis();
    }

    public double fetchVolume() {
        return player.getVolume();
    }

    public void changeVolume(double volume) {
        System.out.println("CHANGING VOLUME TO " + volume);
        player.setVolume(volume);
    }
}
