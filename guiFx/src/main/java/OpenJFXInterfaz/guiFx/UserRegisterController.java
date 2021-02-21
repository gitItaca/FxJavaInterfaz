package OpenJFXInterfaz.guiFx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class UserRegisterController {
	@FXML
	private TextField nameRegister;
	@FXML
	private TextField surnameRegister;
	@FXML
	private TextField telephoneRegister;
	@FXML
	private TextField documentationRegister;
	@FXML
	private CheckBox checkboxMale;
	@FXML
	private CheckBox checkboxFemale;
	@FXML
	private Text textObligatoryFields;
	@FXML
	private SplitMenuButton documentationType;
	
	
	@FXML
	public void handleButtonAction(ActionEvent event) {		//Cierro si haces clic en CLOSE
        Platform.exit();
    }
	
	@FXML
	public void resetFields(ActionEvent event) {			//Si hago clic en el boton reset, borro lo escrito en todos los campos.
		nameRegister.clear();
		surnameRegister.clear();
		telephoneRegister.clear();
		documentationRegister.clear();
		checkboxMale.setSelected(false);
		checkboxFemale.setSelected(false);
		
		textObligatoryFields.setVisible(false);
		nameRegister.setStyle("-fx-background-color: #FFFFFF");
		surnameRegister.setStyle("-fx-background-color: #FFFFFF");
		telephoneRegister.setStyle("-fx-background-color: #FFFFFF");
		documentationRegister.setStyle("-fx-background-color: #FFFFFF");
		checkboxMale.setStyle("-fx-background-color: #FFFFFF");
		checkboxFemale.setStyle("-fx-background-color: #FFFFFF");
	}
	
	@FXML
	public void okButton(ActionEvent event) {				//Si hago clic en el boton OK, revisa que esten rellenados todos los campos obligatorios.
		System.out.println("press");
		if((nameRegister.getText().isEmpty()) || (surnameRegister.getText().isEmpty()) 
				|| (telephoneRegister.getText().isEmpty()) || (documentationRegister.getText().isEmpty())) {
			textObligatoryFields.setVisible(true);
		}
		if(nameRegister.getText().isEmpty()) {			
			nameRegister.setStyle("-fx-background-color: #b51313");
		}
		if(surnameRegister.getText().isEmpty()) {			
			surnameRegister.setStyle("-fx-background-color: #b51313");
		}
		if(telephoneRegister.getText().isEmpty()) {			
			telephoneRegister.setStyle("-fx-background-color: #b51313");
		}
		if(documentationRegister.getText().isEmpty()) {			
			documentationRegister.setStyle("-fx-background-color: #b51313");
		}
		if((!checkboxMale.isSelected()) && (!checkboxFemale.isSelected())) {
			textObligatoryFields.setVisible(true);
			checkboxMale.setStyle("-fx-background-color: #b51313");
			checkboxFemale.setStyle("-fx-background-color: #b51313");
		}
	}
	@FXML
	public void checkDNI(ActionEvent event) {
		documentationType.setText("DNI");
	}
	@FXML
	public void checkNIE(ActionEvent event) {
		documentationType.setText("NIE");
	}
	
	@FXML
	public void checkMale(ActionEvent event) {		
		if(checkboxFemale.isSelected() == true) {
			checkboxFemale.setSelected(false);
		}
    }
	@FXML
	public void checkFemale(ActionEvent event) {		
		if(checkboxMale.isSelected() == true) {
			checkboxMale.setSelected(false);
		}
    }
}
