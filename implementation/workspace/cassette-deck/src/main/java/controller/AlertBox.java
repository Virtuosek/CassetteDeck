/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Virtuosek
 */
public class AlertBox {
    
    public static void display(String title, String type, String message) {
        Stage window = new Stage();
        switch(type){
            case "error": window.getIcons().add(new Image("img/error.png"));
                break;
            case "alert": System.out.println("NIY");
        }
        window.getIcons().add(new Image("img/error.png"));
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label label=new Label();
        label.setText(message);
        Button closeButton=new Button("Ok");
        closeButton.setOnAction(e->window.close());
        VBox layout=new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
}
