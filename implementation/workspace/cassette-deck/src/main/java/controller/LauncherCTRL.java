/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import model.CassetteDeck;
import model.DoubleCassetteDeck;
import model.SingleCassetteDeck;
import model.StageLoader;

/**
 *
 * @author Virtuosek
 */
public class LauncherCTRL {

    public Button launchBtn, cancelBtn;
    public CheckBox recCB, biSpeakerCB, biMicCB, musicDetectCB, autoReverseCB;
    public RadioButton doubleDeckRB, singleDeckRB;
    StageLoader stageLoader;

    public void launchButtonFn() {
        stageLoader = new StageLoader();
        CassetteDeck cassetteDeck;
        
        if (singleDeckRB.isSelected()) {
        	cassetteDeck = new SingleCassetteDeck(false, false, false, false, false);
            FXMLLoader loader = stageLoader.launchFXMLScene("/singleDeck.fxml", "Single deck", cassetteDeck);
        } else if (doubleDeckRB.isSelected()) {
        	cassetteDeck = new DoubleCassetteDeck(false, false, false, false, false);
            stageLoader.launchFXMLScene("/doubleDeck.fxml", "Double deck", cassetteDeck);
        } else {
            AlertBox.display("Error", "error", "Please select deck type");
        }
//        
//        
//        
//        if(biSpeakerCB.isSelected()) {
//        	deck.set
//        }
    }
    
    public void setFunctionalities() {
    	
    }

    public void cancelButtonFn() {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }
}
