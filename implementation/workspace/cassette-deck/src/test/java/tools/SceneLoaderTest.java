/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javafx.stage.Stage;
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
public class SceneLoaderTest {
    
    public SceneLoaderTest() {
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
     * Test of loadScene method, of class SceneLoader.
     */
    @Test
    public void testLoadScene() {
        System.out.println("loadScene");
        Stage window = null;
        String location = "";
        SceneLoader instance = new SceneLoader();
        instance.loadScene(window, location);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loadSceneWithData method, of class SceneLoader.
     */
    @Test
    public void testLoadSceneWithData() {
        System.out.println("loadSceneWithData");
        Stage window = null;
        String location = "";
        Object data = null;
        Class dataType = null;
        SceneLoader instance = new SceneLoader();
        instance.loadSceneWithData(window, location, data, dataType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
