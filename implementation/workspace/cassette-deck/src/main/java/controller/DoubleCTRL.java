	package controller;

import java.io.File;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Cassette;
import model.CassetteDeck;
import model.Deck;
import model.DoubleCassetteDeck;
import tools.FileLoader;
import tools.Status;

public class DoubleCTRL extends SimulationCTRL {

	@FXML
	private HBox playerAndRecorder2HB;
	@FXML
	private HBox playerHeader2HB;
	@FXML
	private HBox navigation2HB;
	@FXML
	private VBox recorder2VB;
	@FXML
	private HBox recorderHeader2HB;
	@FXML
	private VBox heads2VB;
	@FXML
	private Slider volume2S;
	@FXML
	private Slider balance2S;
	@FXML
	private Slider recordVolume2S;
	@FXML
	private Slider recordBalance2S;
	@FXML
	private Label status2L;
	@FXML
	private Label counter2L;
	@FXML
	private Button eject2Btn;
	@FXML
	private Button insert2Btn;
	@FXML
	private Button flip2Btn;
	@FXML
	private Label playerSource2L;
	@FXML
	private Button resetCounter2Btn;
	@FXML
	private Button play2Btn;
	@FXML
	private Button pause2Btn;
	@FXML
	private Button stop2Btn;
	@FXML
	private Button fastRewind2Btn;
	@FXML
	private Button fastForward2Btn;
	@FXML
	private Button previousSong2Btn;
	@FXML
	private Button nextSong2Btn;
	@FXML
	private Button autoReverse2Btn;
	@FXML
	private Label recorderSource2L;
	@FXML
	private Button record2Btn;
	@FXML
	private RadioButton magneticHeadA2RB;
	@FXML
	private RadioButton magneticHeadB2RB;
	@FXML
	private RadioButton motor2RB;
	@FXML
	private ProgressBar progress2PB;
	
	private DoubleCassetteDeck doubleCassetteDeck;
		
    public void eject1Fn() {
    	System.out.println("*EJECT BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().eject();
        progressPB.setProgress(0.);
    }
    
    public void insert1Fn() {
        System.out.println("*INSERT BUTTON 1 PRESSED*");
        Deck deck = cassetteDeck.getDeck();
        File songFile = null;
        if(!doubleCassetteDeck.getDeck().getHolder().hasCassette()) {
        	fileLoader = new FileLoader();
        	songFile = fileLoader.openFile();
        }
        if(songFile != null) {
            deck.insert(new Cassette(songFile));
        	deck.getHolder().getCassette().progressProperty().addListener(new ChangeListener<Number>() {
    			@Override
    			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
    				progressPB.setProgress(deck.getHolder().getCassette().getProgress());
    			}
        	});
        }
    }
    
    public void flip1Fn() {
        System.out.println("*FLIP BUTTON 1 PRESSED*");
        // TODO
    }
    
    public void playerSource1Fn() {
    	System.out.println("*PLAYER SOURCE BUTTON 1 PRESSED*");
    	// TODO
    }
    
    public void resetCounter1Fn() {
    	System.out.println("*RESET COUNTER BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().resetCounter();
    }

    public void play1Fn() {
    	System.out.println("*PLAY BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().play();
    }
    
    public void pause1Fn() {
    	System.out.println("*PAUSE BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().pause();
    }
    
    public void stop1Fn() {
    	System.out.println("*STOP BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().stop();
    }
    
    public void fastRewind1Fn() {
    	System.out.println("*FAST REWIND BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().fastRewind();
    }
    
    public void fastForward1Fn() {
    	System.out.println("*FAST FORWARD BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().fastForward();
    }
    
    public void previousSong1Fn() {
    	System.out.println("*PREVIOUS SONG BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().previousSong();
    }
    
    public void nextSong1Fn() {
    	System.out.println("*NEXT SONG BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().nextSong();
    }
    
    public void autoReverse1Fn() {
    	System.out.println("*AUTO REVERSE BUTTON 1 PRESSED*");
    	if(doubleCassetteDeck.getDeck().isAutoReversing()) {
    		doubleCassetteDeck.getDeck().disableAutoReverse();
    	}
    	else {
    		doubleCassetteDeck.getDeck().enableAutoReverse();;
    	}
    }
    
    public void recorderSource1Fn() {
    	System.out.println("*RECORDER SOURCE BUTTON 1 PRESSED*");
    	// TODO
    }
    
    public void record1Fn() {
    	System.out.println("*RECORD BUTTON 1 PRESSED*");
    	doubleCassetteDeck.getDeck().record();
    }
    
    public void eject2Fn() {
    	System.out.println("*EJECT BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().eject();
        progress2PB.setProgress(0.);
    }
    
    public void insert2Fn() {
        System.out.println("*INSERT BUTTON 2 PRESSED*");
        Deck deck2 = doubleCassetteDeck.getDeck2();
        File songFile = null;
        if(!doubleCassetteDeck.getDeck2().getHolder().hasCassette()) {
        	fileLoader = new FileLoader();
        	songFile = fileLoader.openFile();
        }
        if(songFile != null) {
            deck2.insert(new Cassette(songFile));
        	deck2.getHolder().getCassette().progressProperty().addListener(new ChangeListener<Number>() {
    			@Override
    			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
    				progress2PB.setProgress(deck2.getHolder().getCassette().getProgress());
    			}
        	});
        }
    }
    
    public void flip2Fn() {
        System.out.println("*FLIP BUTTON 2 PRESSED*");
        // TODO
    }
    
    public void playerSource2Fn() {
    	System.out.println("*PLAYER SOURCE BUTTON 2 PRESSED*");
    	// TODO
    }
    
    public void resetCounter2Fn() {
    	System.out.println("*RESET COUNTER BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().resetCounter();
    }

    public void play2Fn() {
    	System.out.println("*PLAY BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().play();
    }
    
    public void pause2Fn() {
    	System.out.println("*PAUSE BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().pause();
    }
    
    public void stop2Fn() {
    	System.out.println("*STOP BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().stop();
    }
    
    public void fastRewind2Fn() {
    	System.out.println("*FAST REWIND BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().fastRewind();
    }
    
    public void fastForward2Fn() {
    	System.out.println("*FAST FORWARD BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().fastForward();
    }
    
    public void previousSong2Fn() {
    	System.out.println("*PREVIOUS SONG BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().previousSong();
    }
    
    public void nextSong2Fn() {
    	System.out.println("*NEXT SONG BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().nextSong();
    }
    
    public void autoReverse2Fn() {
    	System.out.println("*AUTO REVERSE BUTTON 2 PRESSED*");
    	if(doubleCassetteDeck.getDeck2().isAutoReversing()) {
    		doubleCassetteDeck.getDeck2().disableAutoReverse();
    	}
    	else {
    		doubleCassetteDeck.getDeck2().enableAutoReverse();;
    	}
    }
    
    public void recorderSource2Fn() {
    	System.out.println("*RECORDER SOURCE BUTTON 2 PRESSED*");
    	// TODO
    }
    
    public void record2Fn() {
    	System.out.println("*RECORD BUTTON 2 PRESSED*");
    	doubleCassetteDeck.getDeck2().record();
    }
    
    @Override
    public void init(CassetteDeck cassetteDeck) {
    	super.init(cassetteDeck);
    	
    	doubleCassetteDeck = (DoubleCassetteDeck) cassetteDeck;
    	Deck deck2 = doubleCassetteDeck.getDeck2();
		status2L.setText(Status.OFF.toString());
    	deck2.statusProperty().addListener(new ChangeListener<Status>() {
    		@Override
    		public void changed(ObservableValue<? extends Status> observable, Status oldValue, Status newValue) {
    			status2L.setText(deck2.getStatus().toString());
    		}
    	});
    	counter2L.setText("0");
    	deck2.counterProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				counter2L.setText(Integer.toString(deck2.getCounter()));
			}
    	});
    	if(cassetteDeck.getSpeakers() != null) {
    		playerSource2L.setText("SPEAKERS");
    	}
    	else {
    		playerSource2L.setText("HEADSET");
    	}
    	if(cassetteDeck.getMicrophone() != null) {
    		recorderSource2L.setText("MICROPHONE");
    	}
    	
        if(!cassetteDeck.hasRecorder()) {
        	playerAndRecorderHB.getChildren().remove(recorderVB);
        	playerAndRecorder2HB.getChildren().remove(recorder2VB);
        }
        if(!cassetteDeck.hasAutoReverse()) {
        	navigationHB.getChildren().remove(autoReverseBtn);
        	navigation2HB.getChildren().remove(autoReverse2Btn);
        	headsVB.getChildren().remove(magneticHeadBRB);
        	heads2VB.getChildren().remove(magneticHeadB2RB);
        	magneticHeadARB.setText("Head");
        	magneticHeadA2RB.setText("Head");
        }
        if(!cassetteDeck.hasSongDetection()) {
        	navigationHB.getChildren().remove(previousSongBtn);
        	navigation2HB.getChildren().remove(previousSong2Btn);
        	navigationHB.getChildren().remove(nextSongBtn);
        	navigation2HB.getChildren().remove(nextSong2Btn);
        }
    }
}
