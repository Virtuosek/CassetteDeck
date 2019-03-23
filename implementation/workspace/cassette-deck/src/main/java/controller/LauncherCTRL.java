/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Virtuosek
 */
public class LauncherCTRL {

    public Button launchBtn, cancelBtn;
    public CheckBox recCB, biSpeakerCB, biMicCB, musicDetectCB, autoReverseCB;
    public RadioButton doubleDeckRB, singleDeckRB;
    public SceneCTRL sctrl = new SceneCTRL();

    public void launchButtonFn() {
        if (singleDeckRB.isSelected()) {
            if (recCB.isSelected()) {
                sctrl.launchFXMLScene("/singleCD.fxml", "Single Deck");
            } else {
            }
        } else if (doubleDeckRB.isSelected()) {
            if (recCB.isSelected()) {
                sctrl.launchFXMLScene("/doubleCD.fxml", "Double Deck");
            } else {
            }
        } else {
            AlertBox.display("Deck", "error", "Please select deck type");
        }
    }

    public void cancelButtonFn() {

    }
}
