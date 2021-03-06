package tools;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    
    public static void display(String title, String type, String message) {
        Stage window = new Stage();
        switch(type){
            case "error": window.getIcons().add(new Image("img/error.png"));
                break;
            case "alert": window.getIcons().add(new Image("img/alert.png"));
                break;
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
