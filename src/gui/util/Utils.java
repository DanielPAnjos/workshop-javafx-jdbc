package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	//Palco atual. 
	//Acessar um Stage aonde o controller que recebeu o evento está.
	public static Stage currentStage(ActionEvent event) {
		return (Stage)((Node)event.getSource()).getScene().getWindow();
		
	}
}
