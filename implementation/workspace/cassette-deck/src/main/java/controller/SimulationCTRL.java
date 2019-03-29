package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.CassetteDeck;
import model.Deck;
import tools.FileLoader;
import tools.SceneLoader;
import tools.Status;

public abstract class SimulationCTRL {
	
	@FXML
	protected HBox playerAndRecorderHB;
	@FXML
	protected HBox playerHeaderHB;
	@FXML
	protected HBox navigationHB;
	@FXML
	protected VBox recorderVB;
	@FXML
	protected HBox recorderHeaderHB;
	@FXML
	protected VBox headsVB;
	@FXML
	protected Slider volumeS;
	@FXML
	protected Slider balanceS;
	@FXML
	protected Slider recordVolumeS;
	@FXML
	protected Slider recordBalanceS;
	@FXML
	protected Label statusL;
	@FXML
	protected Label counterL;
	@FXML
	protected Button powerBtn;
	@FXML
	protected Button ejectBtn;
	@FXML
	protected Button insertBtn;
	@FXML
	protected Button backBtn;
	@FXML
	protected Button flipBtn;
	@FXML
	protected Button playerSourceBtn;
	@FXML
	protected Button resetCounterBtn;
	@FXML
	protected Button playBtn;
	@FXML
	protected Button pauseBtn;
	@FXML
	protected Button stopBtn;
	@FXML
	protected Button fastRewindBtn;
	@FXML
	protected Button fastForwardBtn;
	@FXML
	protected Button previousSongBtn;
	@FXML
	protected Button nextSongBtn;
	@FXML
	protected Button autoReverseBtn;
	@FXML
	protected Button recorderSourceBtn;
	@FXML
	protected Button recordBtn;
	@FXML
	protected RadioButton magneticHeadARB;
	@FXML
	protected RadioButton magneticHeadBRB;
	@FXML
	protected RadioButton motorRB;
	@FXML
	protected ProgressBar progressPB;
	
	protected CassetteDeck cassetteDeck;
    protected FileLoader fileLoader;
    
    public void powerFn() {
    	System.out.println("*POWER BUTTON PRESSED*");
    	if(cassetteDeck.isTurnedOn()) {
    		cassetteDeck.turnOff();
    	}
    	else {
    		cassetteDeck.turnOn();
    	}
    }
    
    public void backFn() {
        System.out.println("*BACK BUTTON PRESSED*");
    	Stage window = (Stage) backBtn.getScene().getWindow();
    	SceneLoader<LauncherCTRL> loader = new SceneLoader<>();
    	loader.loadScene(window, "/deckLauncher.fxml");
    }
	
	public void init(CassetteDeck cassetteDeck) {
		this.cassetteDeck = cassetteDeck;
		Deck deck = cassetteDeck.getDeck();
		statusL.setText(Status.OFF.toString());
    	deck.statusProperty().addListener(new ChangeListener<Status>() {
    		@Override
    		public void changed(ObservableValue<? extends Status> observable, Status oldValue, Status newValue) {
    			statusL.setText(deck.getStatus().toString());
    		}
    	});
    	counterL.setText("0");
    	deck.counterProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				counterL.setText(Integer.toString(deck.getCounter()));
			}
    	});
	}
}
