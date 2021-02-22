package OpenJFXInterfaz.guiFx;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController {
	
	@FXML
	private TextField usernameField;
	@FXML
	private TextField showPassField;
	@FXML
	private PasswordField passField;
	@FXML
	private Text textObligatoryFields;
	@FXML
	private CheckBox showPassBox;
	
	
	@FXML
	public void closeButtonAction(ActionEvent event) {		//Cierro si haces clic en CLOSE
        Platform.exit();
    }

	@FXML
	public void okButton(MouseEvent  event) {
		if((usernameField.getText().isEmpty()) || (passField.getText().isEmpty())) {
			textObligatoryFields.setVisible(true);
		}else {
			textObligatoryFields.setVisible(false);
		}
		if(usernameField.getText().isEmpty()) {
			usernameField.setStyle("-fx-background-color: #b51313");
		}else {
			usernameField.setStyle("-fx-background-color: #FFFFFF");
		}
		if(passField.getText().isEmpty()) {
			passField.setStyle("-fx-background-color: #b51313");
		}else {
			passField.setStyle("-fx-background-color: #FFFFFF");
		}
	}
	
	@FXML
	public void showPassword(MouseEvent  event) {		//Muestro la contrasenha y la vuelvo a ocultar si haces clic en el checkbox
        String password = passField.getText();			//Guardo el texto de la contrasenha
        if(showPassBox.isSelected() == true) {
        	showPassField.setText(password);
        	showPassField.setVisible(true);
        	passField.setVisible(false);
        }else {        	
        	showPassField.setVisible(false);
        	passField.setVisible(true);        	
        }
        password = showPassField.getText();				//Guardo el texto de la contrasenha escrito en el TextField
        passField.setText(password);					//Escribo el texto guardado en el PasswordField
    }
	
	@FXML
	public void forgotPasswordWindow(MouseEvent  event) throws IOException {	
		 Scene scene = new Scene(loadFXML("recoverPassword"), 310, 220);

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
