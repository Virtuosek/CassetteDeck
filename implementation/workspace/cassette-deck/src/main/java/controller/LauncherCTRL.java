package controller;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import model.CassetteDeck;
import model.DoubleCassetteDeck;
import model.SceneLoader;
import model.SingleCassetteDeck;

public class LauncherCTRL {

    public Button launchBtn, cancelBtn;
    public CheckBox recCB, biSpeakerCB, biMicCB, musicDetectCB, autoReverseCB;
    public RadioButton doubleDeckRB, singleDeckRB;
    private CassetteDeck cassetteDeck;

    public void launchButtonFn() {        
        if (singleDeckRB.isSelected()) {
        	cassetteDeck = new SingleCassetteDeck(
        			recCB.isSelected(),
                    biMicCB.isSelected(),
                    biSpeakerCB.isSelected(),
                    autoReverseCB.isSelected(),
                    musicDetectCB.isSelected()
            );
        	loadSimulation("/singleDeck.fxml");
        } else if (doubleDeckRB.isSelected()) {
        	cassetteDeck = new DoubleCassetteDeck(false, false, false, false, false);
        	loadSimulation("/doubleDeck.fxml");
        } else {
            AlertBox.display("Error", "error", "Please select deck type");
        }
    }
    
    public void cancelButtonFn() {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }
    
    public void loadSimulation(String location) {
    	Stage window = (Stage) singleDeckRB.getScene().getWindow();
    	SceneLoader<SimulationCTRL> loader = new SceneLoader<>();
    	loader.loadSceneWithData(window, location, cassetteDeck, CassetteDeck.class);
    }
}
