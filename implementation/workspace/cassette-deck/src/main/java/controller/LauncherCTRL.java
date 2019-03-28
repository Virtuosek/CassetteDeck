package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import model.CassetteDeck;
import model.DoubleCassetteDeck;
import model.SceneLoader;
import model.SingleCassetteDeck;
import model.Start;

public class LauncherCTRL {

    @FXML
    private Button launchBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private CheckBox biSpeakerCB;
    @FXML
    private CheckBox recCB;
    @FXML
    private CheckBox biMicCB;
    @FXML
    private CheckBox autoReverseCB;
    @FXML
    private CheckBox musicDetectionCB;
    @FXML
    private RadioButton singleDeckRB;
    @FXML
    private RadioButton doubleDeckRB;

    private CassetteDeck cassetteDeck;

    public void launchButtonFn() {
        if (singleDeckRB.isSelected()) {
            cassetteDeck = new SingleCassetteDeck(
                    recCB.isSelected(),
                    biMicCB.isSelected(),
                    biSpeakerCB.isSelected(),
                    autoReverseCB.isSelected(),
                    musicDetectionCB.isSelected()
            );
            loadSimulation(Start.SINGLE_LOCATION);
        } else if (doubleDeckRB.isSelected()) {
            cassetteDeck = new DoubleCassetteDeck(
                    recCB.isSelected(),
                    biMicCB.isSelected(),
                    biSpeakerCB.isSelected(),
                    autoReverseCB.isSelected(),
                    musicDetectionCB.isSelected()
            );
            loadSimulation(Start.DOUBLE_LOCATION);
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
