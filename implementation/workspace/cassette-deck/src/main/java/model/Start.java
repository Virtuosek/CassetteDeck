package model;

import javafx.application.Application;
import javafx.stage.Stage;

public class Start extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
        StageLoader stageLoader = new StageLoader();
        stageLoader.launchFXMLScene("/deckLauncher.fxml", "Launcher", null);
    }

    public static void main(String[] args) {
    	launch(args);
    }
}
