/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javazoom.jl.player.Player;
import model.CassetteDeck;

/**
 *
 * @author Virtuosek
 */
public class SingleCTRL {
	
    public Button playBtn, insertBtn, ejectBtn;
    private File songFile=null;
    private AnchorPane audioRecorderP;
    
    private CassetteDeck cassetteDeck;
    AudioManager audm;
    
    public void initialize() {
    	System.out.println("initialize");
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

    public void setCassetteDeck(CassetteDeck cassetteDeck) {
    	this.cassetteDeck = cassetteDeck;
    }
}
