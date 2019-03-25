/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import javafx.scene.control.Button;
import javazoom.jl.player.Player;

/**
 *
 * @author Virtuosek
 */
public class SingleCTRL {

    public Button playBtn, insertCBtn, ejectBtn;
    private File songFile=null;
    AudioManager audm;

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
        try {
            if(songFile==null){
                AlertBox.display("No cassette inserted", "alert", "Please insert a cassette by Clicking on the arrow down button (top right)");
            }
            Player p = new Player(new FileInputStream(songFile)); //loads song into player
            p.play();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

}
