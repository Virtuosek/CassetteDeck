package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Motor {

    private BooleanProperty isTurnedOn;

    public Motor() {
        isTurnedOn = new SimpleBooleanProperty(false);
    }

    public void turnOn() {
        isTurnedOn.set(true);
        System.out.println("The motor is turned on.");
    }

    public void turnOff() {
        isTurnedOn.set(false);
        System.out.println("The motor is off.");
    }

    public boolean isTurnedOn() {
        return isTurnedOn.get();
    }

    public void setTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn.set(isTurnedOn);
    }

    public BooleanProperty isTurnedOnPropery() {
        return isTurnedOn;
    }
}
