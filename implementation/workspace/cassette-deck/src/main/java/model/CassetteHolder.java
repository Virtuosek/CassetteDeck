package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public class CassetteHolder {
    
    private BooleanProperty isOpen;
    private BooleanProperty hasCassette;
    private ObjectProperty<Cassette> cassette;
    
    public CassetteHolder() {
        isOpen = new SimpleBooleanProperty(false);
        hasCassette = new SimpleBooleanProperty(false);
        cassette = new SimpleObjectProperty<Cassette>();
    }
    
    public void open() {
        isOpen.set(true);
    }
    
    public void close() {
        isOpen.set(false);
    }
    
    public boolean putCassette(Cassette cassette) {
        if (isOpen.get() == true && !hasCassette.get()) {
            this.cassette.set(cassette);
            hasCassette.set(true);
            return true;
        }
        return false;
    }
    
    public boolean removeCassette() {
        if (isOpen.get() == true && hasCassette.get()) {
            this.cassette.set(null);
            hasCassette.set(false);
            return true;
        }
        return false;
    }
    
    public boolean isOpen() {
        return isOpen.get();
    }
    
    public void setOpen(boolean isOpen) {
        this.isOpen.set(isOpen);
    }
    
    public BooleanProperty isOpenProperty() {
    	return isOpen;
    }
    
    public boolean hasCassette() {
        return hasCassette.get();
    }
    
    public void setHasCassette(boolean hasCassette) {
        this.hasCassette.set(hasCassette);
    }
    
    public BooleanProperty hasCassetteProperty() {
    	return hasCassette;
    }
    
    public Cassette getCassette() {
        return cassette.get();
    }
    
    public void setCassette(Cassette cassette) {
    	this.cassette.set(cassette);
    }
}
