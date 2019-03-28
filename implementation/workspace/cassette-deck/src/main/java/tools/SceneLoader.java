package tools;

import java.lang.reflect.Method;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneLoader<T> {

	public void loadScene(Stage window, String location) {
		try {
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(SceneLoader.class.getResource(location));
            Parent root = loader.load(); //make sure fxml files are in src/main/resources, otherwise it won't work.
            
            window.setScene(new Scene(root));
            window.show();
        } catch(Exception e) {
            System.out.println("Error launching " + location + ": " + e.getCause());
            e.printStackTrace();
        }
	}
	
	public void loadSceneWithData(Stage window, String location, Object data, Class<?> dataType) {
		try {
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(SceneLoader.class.getResource(location));
            Parent root = loader.load(); //make sure fxml files are in src/main/resources, otherwise it won't work.
            
            T controller = loader.getController();
        	Method init = controller.getClass().getMethod("init", dataType);
        	init.invoke(controller, data);
        	
            window.setScene(new Scene(root));
            window.show();
        } catch(Exception e) {
            System.out.println("Error launching " + location + ": " + e.getCause());
            e.printStackTrace();
        }
	}
}
