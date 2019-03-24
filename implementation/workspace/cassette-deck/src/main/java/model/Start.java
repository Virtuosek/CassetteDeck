package model;

import controller.SceneCTRL;
import javafx.application.Application;
import javafx.stage.Stage;

public class Start extends Application {

    public static void main(String[] args) {
        launch(args);
        Simulation simulation = new Simulation();
        simulation.start();
    }

    @Override
    public void start(Stage stage) throws Exception {
        SceneCTRL sctrl = new SceneCTRL();
        sctrl.launchFXMLScene("/deckLauncher.fxml", "Launcher");
    }

}
