/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karim
 */
public class AudioManagerTest {
    
    public AudioManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadFile method, of class AudioManager.
     */
    @Test
    public void testLoadFile() {
        System.out.println("loadFile");
        File songFile = null;
        AudioManager instance = new AudioManager();
        instance.loadFile(songFile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of unloadFile method, of class AudioManager.
     */
    @Test
    public void testUnloadFile() {
        System.out.println("unloadFile");
        AudioManager instance = new AudioManager();
        instance.unloadFile();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class AudioManager.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        AudioManager instance = new AudioManager();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class AudioManager.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        AudioManager instance = new AudioManager();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class AudioManager.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        AudioManager instance = new AudioManager();
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fastRewind method, of class AudioManager.
     */
    @Test
    public void testFastRewind() {
        System.out.println("fastRewind");
        double fastRewindingTime = 0.0;
        AudioManager instance = new AudioManager();
        boolean expResult = false;
        boolean result = instance.fastRewind(fastRewindingTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fastForward method, of class AudioManager.
     */
    @Test
    public void testFastForward() {
        System.out.println("fastForward");
        double fastForwardingTime = 0.0;
        AudioManager instance = new AudioManager();
        boolean expResult = false;
        boolean result = instance.fastForward(fastForwardingTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of record method, of class AudioManager.
     */
    @Test
    public void testRecord() {
        System.out.println("record");
        AudioManager instance = new AudioManager();
        instance.record();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stopRecord method, of class AudioManager.
     */
    @Test
    public void testStopRecord() {
        System.out.println("stopRecord");
        AudioManager instance = new AudioManager();
        instance.stopRecord();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAtEnd method, of class AudioManager.
     */
    @Test
    public void testIsAtEnd() {
        System.out.println("isAtEnd");
        AudioManager instance = new AudioManager();
        boolean expResult = false;
        boolean result = instance.isAtEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
