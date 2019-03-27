package controller;

import java.io.File;

import model.Cassette;
import model.CassetteDeck;

public class SingleCTRL extends SimulationCTRL {
	
	public void ejectFn() {
    	System.out.println("*EJECT BUTTON PRESSED*");
    	cassetteDeck.getDeck().eject();
    }
    
    public void insertFn() {
        System.out.println("*INSERT BUTTON PRESSED*");
        File songFile = null;
        if(!cassetteDeck.getDeck().getHolder().hasCassette()) {
        	audm = new AudioManager();
        	songFile = audm.openFile();
        }
        cassetteDeck.getDeck().insert(new Cassette(songFile));
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
    
    public void recordFn() {
    	System.out.println("*RECORD BUTTON PRESSED*");
    	cassetteDeck.getDeck().record();
    }
    
    public void init(CassetteDeck cassetteDeck) {
    	this.cassetteDeck = cassetteDeck;
    	if(!cassetteDeck.hasRecorder()) {
    		playerAndRecorderSP.getItems().remove(1);
    	}
    }
}
