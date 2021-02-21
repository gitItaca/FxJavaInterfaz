package OpenJFXInterfaz.guiFx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

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
        
//        passField.setText(passField.getText());

    }
}
