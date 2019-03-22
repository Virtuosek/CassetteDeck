/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Virtuosek
 */
public class LauncherCTRL {

    public Button launchBtn, cancelBtn;
    public CheckBox recCB, biSpeakerRB, biMicRB, musicDetectCB, autoReverseCB;
    public RadioButton doubleDeckRB, singleDeckRB;

    public void launchButtonFn() {
        System.out.println("Launch button clicked");
        if (singleDeckRB.isSelected()) {
            System.out.println("* Single deck");
            if (recCB.isSelected()) {
                System.out.println("* Audio recorder");
            } else {

            }
        } else if (doubleDeckRB.isSelected()) {
            System.out.println("* Double deck");
            if (recCB.isSelected()) {
                System.out.println("* Audio recorder");
            } else {

            }
        } else {
            AlertBox.display("Deck", "Please select deck type");
        }
    }

    public void cancelButtonFn() {
        System.out.println("Cancel button clicked");
    }

}
