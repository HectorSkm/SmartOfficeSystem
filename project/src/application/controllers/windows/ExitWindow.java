package application.controllers.windows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ExitWindow{

	@FXML
	public Button aceptar;
	
	public ExitWindow(Stage st) {
		try {
			
			//SET ROOT AND CONTROLLER (THIS CLASS IS THE CONTROLLER)
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/scenes/windows/exitWindow.fxml"));
			loader.setController(this);
			Parent root = loader.load();
			
			//BLOCK MAIN STAGE
			Stage primaryStage = new Stage();
			primaryStage.initModality(Modality.WINDOW_MODAL); //blocks owner window
			//primaryStage.initModality(Modality.APPLICATION_MODAL); //blocks all windows
			primaryStage.initOwner(st);
			
			//SHOW MESSAGE WINDOW
			primaryStage.setTitle("Exit");
			Scene sc = new Scene(root);
			primaryStage.setScene(sc);
			primaryStage.show();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void pressEnter(KeyEvent event) {
		if(event.getCode()==KeyCode.ENTER) {
			close();
		}
	}
	public void close() {
		Stage s = (Stage) aceptar.getScene().getWindow();
		s.close();
	}
	public void exit() {
		Stage s = (Stage) aceptar.getScene().getWindow();
		s.close();
		System.exit(0);
		
	}
}
