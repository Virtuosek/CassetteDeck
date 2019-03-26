/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SingleCTRL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Virtuosek
 */
public class StageLoader {

    public FXMLLoader launchFXMLScene(String rootLoc, String title, CassetteDeck cassetteDeck) {
    	FXMLLoader loader = new FXMLLoader();
        try {
        	System.out.println("stageLoader");
        	loader.setLocation(getClass().getResource(rootLoc));
        	if(cassetteDeck != null) {
        		SingleCTRL singleCTRL = loader.getController();
        		System.out.println(singleCTRL);
        		singleCTRL.setCassetteDeck(cassetteDeck);
        	}
            Parent root = loader.load(); //make sure fxml files are in src/main/resources, otherwise it won't work.
            System.out.println("after stageLoader");
            Stage stage = new Stage();
           // stage.initModality(Modality.APPLICATION_MODAL); //(a) keeps the user from manipulating the launcher while the deck window is open
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.sizeToScene(); //bugFixed: disables stage.setResizable(false); from adding extra margins
            stage.getIcons().add(new Image("img/icon.png"));
            stage.show(); //works with (a)
        } catch (Exception e) {
            System.out.println("Error launching " + rootLoc + ": " + e.getCause());
            e.printStackTrace();
        }
        return loader;  
    }
}
