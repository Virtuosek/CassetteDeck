package model;

import controller.LauncherCTRL;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {
	
	public static final String ROOT_LOCATION = "/deckLauncher.fxml";
	public static final String SINGLE_LOCATION = "/doubleDeck_exp.fxml"; //tmp for testing
	public static final String DOUBLE_LOCATION = "/doubleDeck.fxml";
	private static final String ICON_LOCATION = "img/icon.png";
	private static final String WINDOW_NAME = "Cassette Deck Simulator";
	public static final double FAST_PLAYBACK_SPEED_FACTOR = 10.;
	
    @Override
    public void start(Stage window) throws Exception {
    	window.setTitle(WINDOW_NAME);
        window.setResizable(false);
        window.sizeToScene(); //bugFixed: disables stage.setResizable(false); from adding extra margins
        window.getIcons().add(new Image(ICON_LOCATION));
        
        SceneLoader<LauncherCTRL> loader = new SceneLoader<>();
        loader.loadScene(window, ROOT_LOCATION);
    }

    public static void main(String[] args) {
    	launch(args);
    }
}
