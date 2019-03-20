package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Start extends Application {

    public static void main(String[] args) {
        launch(args);
        System.out.println("launched?");
        Simulation simulation = new Simulation();
        simulation.start();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/cdLauncher.fxml")); //make sure fxml files are in src/main/resources, otherwise it won't work.
        stage.setTitle("t");
        stage.setScene(new Scene(root));
        stage.show();

        /* Testing if display works: */
//        Button button = new Button();
//        button.setText("Click");
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//        Scene scene = new Scene(layout, 300, 250);
//        stage.setScene(scene);
//        stage.show();
        System.out.println("Display?");
    }

}
