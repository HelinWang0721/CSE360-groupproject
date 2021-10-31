package groupproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class projectcontroller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchtoroot(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("project.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchtoreg(ActionEvent event)throws IOException {
		Parent reg = FXMLLoader.load(getClass().getResource("regscene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(reg);
		stage.setScene(scene);
		stage.show();
	}
}
