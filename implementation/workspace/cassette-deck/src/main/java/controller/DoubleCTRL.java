	package controller;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import model.Cassette;
import model.CassetteDeck;
import model.DoubleCassetteDeck;
import tools.FileLoader;

public class DoubleCTRL extends SimulationCTRL {

	@FXML
	private VBox deckControllerVB;
	@FXML
	private Slider volume2S;
	@FXML
	private Slider balance2S;
	@FXML
	private Slider recordVolume2S;
	@FXML
	private Slider recordBalance2S;
	@FXML
	private Label status2L;
	@FXML
	private Button eject2Btn;
	@FXML
	private Button insert2Btn;
	@FXML
	private Button flip2Btn;
	@FXML
	private Button playerSource2Btn;
	@FXML
	private Button resetCounter2Btn;
	@FXML
	private Button play2Btn;
	@FXML
	private Button pause2Btn;
	@FXML
	private Button stop2Btn;
	@FXML
	private Button fastRewind2Btn;
	@FXML
	private Button fastForward2Btn;
	@FXML
	private Button previousSong2Btn;
	@FXML
	private Button nextSong2Btn;
	@FXML
	private Button autoReverse2Btn;
	@FXML
	private Button recorderSource2Btn;
	@FXML
	private Button record2Btn;
	@FXML
	private RadioButton magneticHeadA2RB;
	@FXML
	private RadioButton magneticHeadB2RB;
	@FXML
	private RadioButton motor2RB;
	@FXML
	private ProgressBar progress2PB;
	
	private DoubleCassetteDeck doubleCassetteDeck;
		
    public void eject1Fn() {
    	System.out.println("*EJECT BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().eject();
    }
    
    public void insert1Fn() {
        System.out.println("*INSERT BUTTON 1 PRESSED*");
        File songFile = null;
        if(!doubleCassetteDeck.getDeck().getHolder().hasCassette()) {
        	fileLoader = new FileLoader();
        	songFile = fileLoader.openFile();
        }
        doubleCassetteDeck.getDeck().insert(new Cassette(songFile));
    }
    
    public void flip1Fn() {
        System.out.println("*FLIP BUTTON 1 PRESSED*");
        // TODO
    }
    
    public void playerSource1Fn() {
    	System.out.println("*PLAYER SOURCE BUTTON 1 PRESSED*");
    	// TODO
    }
    
    public void resetCounter1Fn() {
    	System.out.println("*RESET COUNTER BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().resetCounter();
    }

    public void play1Fn() {
    	System.out.println("*PLAY BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().play();
    }
    
    public void pause1Fn() {
    	System.out.println("*PAUSE BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().pause();
    }
    
    public void stop1Fn() {
    	System.out.println("*STOP BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().stop();
    }
    
    public void fastRewind1Fn() {
    	System.out.println("*FAST REWIND BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().fastRewind();
    }
    
    public void fastForward1Fn() {
    	System.out.println("*FAST FORWARD BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().fastForward();
    }
    
    public void previousSong1Fn() {
    	System.out.println("*PREVIOUS SONG BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().previousSong();
    }
    
    public void nextSong1Fn() {
    	System.out.println("*NEXT SONG BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().nextSong();
    }
    
    public void autoReverse1Fn() {
    	System.out.println("*AUTO REVERSE BUTTON 1 PRESSED*");
    	if(doubleCassetteDeck.getDeck().isAutoReversing()) {
    		doubleCassetteDeck.getDeck().disableAutoReverse();
    	}
    	else {
    		doubleCassetteDeck.getDeck().enableAutoReverse();;
    	}
    }
    
    public void recorderSource1Fn() {
    	System.out.println("*RECORDER SOURCE BUTTON 1 PRESSED*");
    	// TODO
    }
    
    public void record1Fn() {
    	System.out.println("*RECORD BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().record();
    }
    
    public void eject2Fn() {
    	System.out.println("*EJECT BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().eject();
    }
    
    public void insert2Fn() {
        System.out.println("*INSERT BUTTON 2 PRESSED*");
        File songFile = null;
        if(!doubleCassetteDeck.getDeck2().getHolder().hasCassette()) {
        	fileLoader = new FileLoader();
        	songFile = fileLoader.openFile();
        }
        doubleCassetteDeck.getDeck2().insert(new Cassette(songFile));
    }
    
    public void flip2Fn() {
        System.out.println("*FLIP BUTTON 2 PRESSED*");
        // TODO
    }
    
    public void playerSource2Fn() {
    	System.out.println("*PLAYER SOURCE BUTTON 2 PRESSED*");
    	// TODO
    }
    
    public void resetCounter2Fn() {
    	System.out.println("*RESET COUNTER BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().resetCounter();
    }

    public void play2Fn() {
    	System.out.println("*PLAY BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().play();
    }
    
    public void pause2Fn() {
    	System.out.println("*PAUSE BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().pause();
    }
    
    public void stop2Fn() {
    	System.out.println("*STOP BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().stop();
    }
    
    public void fastRewind2Fn() {
    	System.out.println("*FAST REWIND BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().fastRewind();
    }
    
    public void fastForward2Fn() {
    	System.out.println("*FAST FORWARD BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().fastForward();
    }
    
    public void previousSong2Fn() {
    	System.out.println("*PREVIOUS SONG BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().previousSong();
    }
    
    public void nextSong2Fn() {
    	System.out.println("*NEXT SONG BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().nextSong();
    }
    
    public void autoReverse2Fn() {
    	System.out.println("*AUTO REVERSE BUTTON 2 PRESSED*");
    	if(doubleCassetteDeck.getDeck2().isAutoReversing()) {
    		doubleCassetteDeck.getDeck2().disableAutoReverse();
    	}
    	else {
    		doubleCassetteDeck.getDeck2().enableAutoReverse();;
    	}
    }
    
    public void recorderSource2Fn() {
    	System.out.println("*RECORDER SOURCE BUTTON 2 PRESSED*");
    	// TODO
    }
    
    public void record2Fn() {
    	System.out.println("*RECORD BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().record();
    }
    
    @Override
    public void init(CassetteDeck cassetteDeck) {
    	super.init(cassetteDeck);
    	doubleCassetteDeck = (DoubleCassetteDeck) cassetteDeck;
		
        if(!cassetteDeck.hasSpeakers()) {
        	
        }
        if(!cassetteDeck.hasRecorder()) {
        	
        }
        if(!cassetteDeck.hasMicrophone()) {

        }
        if(!cassetteDeck.hasAutoReverse()) {

        }
        if(!cassetteDeck.hasSongDetection()) {

        }
    }
}
