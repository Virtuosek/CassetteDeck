package controller;

import java.io.File;
import java.io.FileInputStream;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javazoom.jl.player.Player;

import model.CassetteDeck;
import model.SceneLoader;

public class SingleCTRL extends SimulationCTRL {
	
    public Button playBtn, insertBtn, ejectBtn;
    private File songFile=null;
    public AnchorPane audioRecorderP;
    
    AudioManager audm;
    
    public void init(CassetteDeck cassetteDeck) {
    	audioRecorderP.setVisible(cassetteDeck.hasRecorder());
    }

    public void insertFn() {
        System.out.println("Insert pressed");
        audm = new AudioManager();
        songFile = audm.openFile();
    }
    
    public void ejectFn(){
        songFile=null;
        System.out.println("Eject pressed");
    }
    
    public void returnFn() {
        Stage window = (Stage) ejectBtn.getScene().getWindow();
        SceneLoader<LauncherCTRL> loader = new SceneLoader<>();
        loader.loadScene(window, "/deckLauncher.fxml");
    }

    public void playFn() {
        if(songFile==null){
            AlertBox.display("No cassette inserted", "alert", "Please insert a cassette by Clicking on the arrow down button (top right)");
        }
        new Thread() {
            public void run() {
                try {
                    Player p = new Player(new FileInputStream(songFile)); //loads song into player
                    p.play();
                } catch (Exception e) {
                    System.out.println(e.getCause());
                }
            }
        }.start();
        System.out.println("playing audio");
    }
}
