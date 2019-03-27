	package controller;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import model.Cassette;
import model.CassetteDeck;
import model.DoubleCassetteDeck;

public class DoubleCTRL extends SimulationCTRL {

	@FXML
	private SplitPane playerAndRecorder2SP;
	@FXML
	private Slider volume2S;
	@FXML
	private Slider balance2S;
	@FXML
	private Slider recordVolume2S;
	@FXML
	private Slider recordBalance2S;
	@FXML
	private Button eject2Btn;
	@FXML
	private Button insert2Btn;
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
	private Button record2Btn;
	@FXML
	private RadioButton magneticHeadA2RB;
	@FXML
	private RadioButton magneticHeadB2RB;
	@FXML
	private RadioButton motor2RB;
	@FXML
	private ProgressIndicator progress2PI;
	
	private DoubleCassetteDeck doubleCassetteDeck;
		
    public void eject1Fn() {
    	System.out.println("*EJECT BUTTON 1 PRESSED*");
    	cassetteDeck.getDeck().eject();
    }
    
    public void insert1Fn() {
        System.out.println("*INSERT BUTTON 1 PRESSED*");
        File songFile = null;
        if(!cassetteDeck.getDeck().getHolder().hasCassette()) {
        	audm = new AudioManager();
        	songFile = audm.openFile();
        }
        cassetteDeck.getDeck().insert(new Cassette(songFile));
    }

    public void play1Fn() {
    	System.out.println("*PLAY BUTTON 1 PRESSED*");
        cassetteDeck.getDeck().play();
    }
    
    public void pause1Fn() {
    	System.out.println("*PAUSE BUTTON 1 PRESSED*");
    	cassetteDeck.getDeck().pause();
    }
    
    public void stop1Fn() {
    	System.out.println("*STOP BUTTON 1 PRESSED*");
    	cassetteDeck.getDeck().stop();
    }
    
    public void fastRewind1Fn() {
    	System.out.println("*FAST REWIND BUTTON 1 PRESSED*");
    	cassetteDeck.getDeck().fastRewind();
    }
    
    public void fastForward1Fn() {
    	System.out.println("*FAST FORWARD BUTTON 1 PRESSED*");
    	cassetteDeck.getDeck().fastForward();
    }
    
    public void record1Fn() {
    	System.out.println("*RECORD BUTTON 1 PRESSED*");
    	cassetteDeck.getDeck().record();
    }
    
    public void eject2Fn() {
    	System.out.println("*EJECT BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().eject();
    }
    
    public void insert2Fn() {
        System.out.println("*INSERT BUTTON 2 PRESSED*");
        File songFile = null;
        if(!doubleCassetteDeck.getDeck2().getHolder().hasCassette()) {
        	audm = new AudioManager();
        	songFile = audm.openFile();
        }
        doubleCassetteDeck.getDeck2().insert(new Cassette(songFile));
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
    
    public void record2Fn() {
    	System.out.println("*RECORD BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().record();
    }
    
    @Override
    public void init(CassetteDeck cassetteDeck) {
    	this.cassetteDeck = cassetteDeck;
    	doubleCassetteDeck = (DoubleCassetteDeck) cassetteDeck;
    }
}
