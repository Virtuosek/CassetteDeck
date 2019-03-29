package controller;

import java.io.File;

import model.Cassette;
import model.CassetteDeck;
import tools.FileLoader;

public class SingleCTRL extends SimulationCTRL {
	
    public void ejectFn() {
        System.out.println("*EJECT BUTTON PRESSED*");
        cassetteDeck.getDeck().eject();
    }

    public void insertFn() {
        System.out.println("*INSERT BUTTON PRESSED*");
        File songFile = null;
        if(!cassetteDeck.getDeck().getHolder().hasCassette()) {
            fileLoader = new FileLoader();
            songFile = fileLoader.openFile();
        }
        if(songFile != null) {
            cassetteDeck.getDeck().insert(new Cassette(songFile));
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
    	if(cassetteDeck.getDeck().isAutoReversing()) {
    		cassetteDeck.getDeck().disableAutoReverse();
    	}
    	else {
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
    
    @Override
    public void init(CassetteDeck cassetteDeck) {
    	super.init(cassetteDeck);
    	
        if(!cassetteDeck.hasSpeakers()) {
        	playerHeaderHB.getChildren().remove(playerSourceBtn);
        }
        if(!cassetteDeck.hasRecorder()) {
        	playerAndRecorderHB.getChildren().remove(recorderVB);
        }
        if(!cassetteDeck.hasMicrophone()) {
        	recorderHeaderHB.getChildren().remove(recorderSourceBtn);
        }
        if(!cassetteDeck.hasAutoReverse()) {
        	navigationHB.getChildren().remove(autoReverseBtn);
        	headsVB.getChildren().remove(magneticHeadBRB);
        	magneticHeadARB.setText("Head");
        }
        if(!cassetteDeck.hasSongDetection()) {
        	navigationHB.getChildren().remove(previousSongBtn);
        	navigationHB.getChildren().remove(nextSongBtn);
        }
    }
}
