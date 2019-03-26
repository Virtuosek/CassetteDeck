package controller;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

import model.Cassette;
import model.CassetteDeck;
import model.SceneLoader;

public class SingleCTRL extends SimulationCTRL {
	
	@FXML
	private SplitPane playerAndRecorderSP;
	@FXML
	private Slider volumeS;
	@FXML
	private Slider balanceS;
	@FXML
	private Slider recordVolumeS;
	@FXML
	private Slider recordBalanceS;
	@FXML
	private Button powerBtn;
	@FXML
	private Button ejectBtn;
	@FXML
	private Button insertBtn;
	@FXML
	private Button returnBtn;
	@FXML
	private Button playBtn;
	@FXML
	private Button pauseBtn;
	@FXML
	private Button stopBtn;
	@FXML
	private Button fastRewindBtn;
	@FXML
	private Button fastForwardBtn;
	@FXML
	private Button recordBtn;
	@FXML
	private RadioButton magneticHeadARB;
	@FXML
	private RadioButton magneticHeadBRB;
	@FXML
	private RadioButton motorRB;
	@FXML
	private ProgressIndicator progressPI;
	
	private CassetteDeck cassetteDeck;
    private AudioManager audm;
    
    public void powerFn() {
    	System.out.println("*POWER BUTTON PRESSED*");
    	if(cassetteDeck.isTurnedOn()) {
    		cassetteDeck.turnOff();
    	}
    	else {
    		cassetteDeck.turnOn();
    	}
    }

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
    
    public void returnFn() {
        Stage window = (Stage) returnBtn.getScene().getWindow();
        SceneLoader<LauncherCTRL> loader = new SceneLoader<>();
        loader.loadScene(window, "/deckLauncher.fxml");
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
