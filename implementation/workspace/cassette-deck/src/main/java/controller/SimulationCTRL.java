package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import model.CassetteDeck;
import model.SceneLoader;

public abstract class SimulationCTRL {
	
	@FXML
	protected SplitPane playerAndRecorderSP;
	@FXML
	protected Slider volumeS;
	@FXML
	protected Slider balanceS;
	@FXML
	protected Slider recordVolumeS;
	@FXML
	protected Slider recordBalanceS;
	@FXML
	protected Button powerBtn;
	@FXML
	protected Button ejectBtn;
	@FXML
	protected Button insertBtn;
	@FXML
	protected Button returnBtn;
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
	protected Button recordBtn;
	@FXML
	protected RadioButton magneticHeadARB;
	@FXML
	protected RadioButton magneticHeadBRB;
	@FXML
	protected RadioButton motorRB;
	@FXML
	protected ProgressIndicator progressPI;
	
	protected CassetteDeck cassetteDeck;
    protected AudioManager audm;
    
    public void powerFn() {
    	System.out.println("*POWER BUTTON PRESSED*");
    	if(cassetteDeck.isTurnedOn()) {
    		cassetteDeck.turnOff();
    	}
    	else {
    		cassetteDeck.turnOn();
    	}
    }
    
    public void returnFn() {
    	Stage window = (Stage) returnBtn.getScene().getWindow();
    	SceneLoader<LauncherCTRL> loader = new SceneLoader<>();
    	loader.loadScene(window, "/deckLauncher.fxml");
    }
	
	public abstract void init(CassetteDeck cassetteDeck);
}
