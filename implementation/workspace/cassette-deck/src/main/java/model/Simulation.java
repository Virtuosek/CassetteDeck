package model;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Simulation {

    private CassetteDeck deck;
    private List<Cassette> cassettes;

    public Simulation() {
        this.deck = new CassetteDeck();
        this.cassettes = new ArrayList<>();
    }

    public void start() {

    }
}
