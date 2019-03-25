/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Virtuosek
 */
public class AudioManager {

    public File openFile() {
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Select a cassette");
            chooser.showOpenDialog(null);
            File songFile;
            songFile = chooser.getSelectedFile();
            if (!songFile.getName().endsWith(".mp3")) {
                AlertBox.display("Error", "error", "Please select an mp3 file");
                openFile();
            }
            return songFile;
        } catch (Exception e) {
            System.out.println(e.getCause());
            return null;
        }
    }
}
