package OpenJFXInterfaz.guiFx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class LoginController {
	
	@FXML
	private PasswordField usernameField;
	@FXML
	private PasswordField passField;
	@FXML
	private Text textObligatoryFields;
	
	
	@FXML
	public void closeButtonAction(ActionEvent event) {		//Cierro si haces clic en CLOSE
        Platform.exit();
    }

//	@FXML
//	public void okButton(MouseEvent  event) {
//		if((usernameField.getText().isEmpty()) || (passField.getText().isEmpty())) {
//			textObligatoryFields.setVisible(true);
//		}
//		if(usernameField.getText().isEmpty()) {
//			usernameField.setStyle("-fx-background-color: #b51313");
//		}
//		if(passField.getText().isEmpty()) {
//			passField.setStyle("-fx-background-color: #b51313");
//		}
//	}
	
//	@FXML
//	public void showPassword(MouseEvent  event) {		//Muestro la contrasenha
//        System.out.println("You clicked me!");
        
//        passField.setText(password.getText());

//    }
}
