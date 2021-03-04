package OpenJFXInterfaz.guiFx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AltaUsuarios extends Application{
	 private static Scene scene;

	 @Override
	    public void start(Stage stage) throws IOException {
	    	Parent root = FXMLLoader.load(getClass().getResource("altaUsuarios.fxml"));
	    	Scene scene = new Scene(root, 340, 360);
	    	
	        stage.setResizable(false);
	        stage.initStyle(StageStyle.UNDECORATED);
	        stage.setScene(scene);
	        stage.show();
	    }

	    static void setRoot(String fxml) throws IOException {
	        scene.setRoot(loadFXML(fxml));
	    }

	    private static Parent loadFXML(String fxml) throws IOException {
	        FXMLLoader fxmlLoader = new FXMLLoader(AltaUsuarios.class.getResource(fxml + ".fxml"));
	        return fxmlLoader.load();
	    }

	    public static void main(String[] args) {
	        launch();
	    }
	    
}
