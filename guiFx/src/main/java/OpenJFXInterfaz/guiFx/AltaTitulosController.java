package OpenJFXInterfaz.guiFx;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AltaTitulosController {

	@FXML
	private TextField artistaField;
	@FXML
	private TextField nameField;
	@FXML
	private TextField formatoField;
	@FXML
	private TextField annoField;
	@FXML
	private TextField metaInfoField;
	
	@FXML
	public void closeButtonAction(ActionEvent event) {		//Cierro si haces clic en CLOSE
        Platform.exit();
    }
	
	@FXML
	public void cancelButton(MouseEvent  event) {	
		artistaField.setText("");
		nameField.setText("");
		annoField.setText("");
		metaInfoField.setText("");
  
    }
	
	private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
	
}
