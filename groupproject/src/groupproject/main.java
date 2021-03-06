package groupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		BackEnd.init();
		
		Parent root = FXMLLoader.load(getClass().getResource("project.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		stage.setOnCloseRequest(event -> {
			BackEnd.exit();
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
