package OpenJFXInterfaz.guiFx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class RecoverPasswordController {

	@FXML
	public void closeButtonAction(ActionEvent event) {		//Cierro si haces clic en CLOSE
        Platform.exit();
    }
}
