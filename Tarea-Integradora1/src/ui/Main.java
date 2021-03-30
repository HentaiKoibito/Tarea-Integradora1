package ui;
import model.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private ControllerClassGUI controllerClassGUI;
	private GoldenHouse GH;
	
	public Main() {
		GH= new GoldenHouse();
		controllerClassGUI=new ControllerClassGUI(GH);
	}
	
	public  void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));

		fxmlLoader.setController(controllerClassGUI);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login");
		primaryStage.show();
		
	}

}
