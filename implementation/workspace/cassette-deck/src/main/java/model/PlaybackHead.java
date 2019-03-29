package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class PlaybackHead {

    private BooleanProperty isEngaged;

    public PlaybackHead() {
        isEngaged = new SimpleBooleanProperty(false);
    }

    public void engage() {
        isEngaged.set(true);
        System.out.println("The play head has been engaged.");
    }

    public void disengage() {
        isEngaged.set(false);
        System.out.println("The play head is disengaged.");
    }

    public boolean isEngaged() {
        return isEngaged.get();
    }

    public void setEngaged(boolean isEngaged) {
        this.isEngaged.set(isEngaged);
    }

    public BooleanProperty isEngagedProperty() {
        return isEngaged;
    }
}
