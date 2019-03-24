/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 *
 * @author Virtuosek
 */
public class LauncherCTRL {

    public Button launchBtn, cancelBtn;
    public CheckBox recCB, biSpeakerRB, biMicRB, musicDetectCB, autoReverseCB;
    public RadioButton doubleDeckRB, singleDeckRB;
    SceneCTRL sctrl;

    public void launchButtonFn() {
        sctrl = new SceneCTRL();
        if (singleDeckRB.isSelected()) {
            if (recCB.isSelected()) {
                sctrl.launchFXMLScene("/singleDeck.fxml", "Single deck");
            } else {

            }
        } else if (doubleDeckRB.isSelected()) {
            if (recCB.isSelected()) {
                sctrl.launchFXMLScene("/doubleDeck.fxml", "Double deck");
            } else {

            }
        } else {
            AlertBox.display("Error", "error", "Please select deck type");
        }
    }

    public void cancelButtonFn() {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }
}
