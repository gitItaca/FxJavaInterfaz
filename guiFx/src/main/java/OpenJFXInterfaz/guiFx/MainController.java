package OpenJFXInterfaz.guiFx;

import java.io.IOException;
import java.util.Optional;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController {

	
	@FXML
	public void closeButtonAction(ActionEvent event) {		//Cierro si haces clic en CLOSE
		
		Alert alert = new Alert(AlertType.CONFIRMATION);	//Abro una ventana de confirmacion
		alert.setTitle("Close dialog");
		alert.setHeaderText(null);
		alert.setContentText("Are you sure to exit?");
		Optional <ButtonType> action = alert.showAndWait();
		
		if(action.get() == ButtonType.OK) {
			Platform.exit();
		}
		
    }
	
	@FXML
	public void createClientOpen(ActionEvent event) throws IOException {	//Se abre la ventana para registrar un usuario.
		Scene scene = new Scene(loadFXML("userRegister"), 350, 550);
		
		Stage stage = new Stage();
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
	}
	private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
	
}
