package controller;

import java.io.File;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import model.Cassette;
import model.CassetteDeck;
import model.Deck;
import tools.AudioManager;
import tools.FileLoader;

public class SingleCTRL extends SimulationCTRL {

    public void ejectFn() {
        System.out.println("*EJECT BUTTON PRESSED*");
        cassetteDeck.getDeck().eject();
        progressPB.setProgress(0.);
    }

    public void insertFn() {
        System.out.println("*INSERT BUTTON PRESSED*");
        Deck deck = cassetteDeck.getDeck();
        File songFile = null;
        if(!deck.getHolder().hasCassette()) {
            fileLoader = new FileLoader();
            songFile = fileLoader.openFile();
        }
        if(songFile != null) {
            deck.insert(new Cassette(songFile));
        	deck.getHolder().getCassette().progressProperty().addListener(new ChangeListener<Number>() {
    			@Override
    			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
    				progressPB.setProgress(deck.getHolder().getCassette().getProgress());
    			}
        	});
        }
    }

    public void flipFn() {
        System.out.println("*FLIP BUTTON PRESSED*");
        // TODO
    }

    public void playerSourceFn() {
        System.out.println("*PLAYER SOURCE BUTTON PRESSED*");
        // TODO
    }

    public void resetCounterFn() {
        System.out.println("*RESET COUNTER BUTTON PRESSED*");
        cassetteDeck.getDeck().resetCounter();
    }

    public void playFn() {
        System.out.println("*PLAY BUTTON PRESSED*");
        cassetteDeck.getDeck().play();
    }

    public void pauseFn() {
        System.out.println("*PAUSE BUTTON PRESSED*");
        cassetteDeck.getDeck().pause();
    }

    public void stopFn() {
        System.out.println("*STOP BUTTON PRESSED*");
        cassetteDeck.getDeck().stop();
    }

    public void fastRewindFn() {
        System.out.println("*FAST REWIND BUTTON PRESSED*");
        cassetteDeck.getDeck().fastRewind();
    }

    public void fastForwardFn() {
        System.out.println("*FAST FORWARD BUTTON PRESSED*");
        cassetteDeck.getDeck().fastForward();
    }

    public void previousSongFn() {
        System.out.println("*PREVIOUS SONG BUTTON PRESSED*");
        cassetteDeck.getDeck().previousSong();
    }

    public void nextSongFn() {
        System.out.println("*NEXT SONG BUTTON PRESSED*");
        cassetteDeck.getDeck().nextSong();
    }

    public void autoReverseFn() {
        System.out.println("*AUTO REVERSE BUTTON PRESSED*");
        if (cassetteDeck.getDeck().isAutoReversing()) {
            cassetteDeck.getDeck().disableAutoReverse();
        } else {
            cassetteDeck.getDeck().enableAutoReverse();;
        }
    }

    public void recorderSourceFn() {
        System.out.println("*RECORDER SOURCE BUTTON PRESSED*");
        // TODO
    }

    public void recordFn() {
        System.out.println("*RECORD BUTTON PRESSED*");
        cassetteDeck.getDeck().record();
    }
    
    public void pvolumeFn(){
        System.out.println("VOLUME MODIFIED");
        AudioManager audm = cassetteDeck.getDeck().getAudioManager();
        //volumeS.setValue(audm.fetchVolume()*100);
       // System.out.println("VOLUME FETCHED: "+audm.fetchVolume()*100);
        audm.changeVolume(volumeS.getValue()/100);
        System.out.println("SLIDER VALUE: "+volumeS.getValue()/100);
    }

    @Override
    public void init(CassetteDeck cassetteDeck) {
    	super.init(cassetteDeck);
    	
        if (!cassetteDeck.hasRecorder()) {
            playerAndRecorderHB.getChildren().remove(recorderVB);
        }
        if (!cassetteDeck.hasAutoReverse()) {
            navigationHB.getChildren().remove(autoReverseBtn);
            headsVB.getChildren().remove(magneticHeadBRB);
            magneticHeadARB.setText("Head");
        }
        if (!cassetteDeck.hasSongDetection()) {
            navigationHB.getChildren().remove(previousSongBtn);
            navigationHB.getChildren().remove(nextSongBtn);
        }
    }
}
