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
	
	@FXML private TextField reg_Username_text;
	@FXML private TextField reg_Password_text;
	
	@FXML private TextField reg_FirstName_text;
	@FXML private TextField reg_LastName_text;
	@FXML private TextField reg_Birthday_text;
	@FXML private TextField reg_Gender_text;
	@FXML private TextField reg_Mobile_text;
	
	
	@FXML private TextField nameField;
	@FXML private TextField PasswordField;
	
	
	
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("project.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchtoroot(ActionEvent event) throws IOException {
		
		Patient newPatient = new Patient();
		newPatient.firstName = reg_FirstName_text.getText();
		newPatient.lastName = reg_LastName_text.getText();
		newPatient.birthday = reg_Birthday_text.getText();
		newPatient.gender = reg_Gender_text.getText();
		newPatient.mobile = reg_Mobile_text.getText();
		
		newPatient.username = reg_Username_text.getText();
		newPatient.password = reg_Password_text.getText();
		
		if (BackEnd.addPatient(newPatient)) {
			System.out.print("reg successful\n");
		}
		else {
			System.out.print("reg failed\n");
			return;
		}
		
		
		root = FXMLLoader.load(getClass().getResource("project.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchtoreg(ActionEvent event)throws IOException {
		String username = nameField.getText();
		String password = PasswordField.getText();
		
		Parent reg = FXMLLoader.load(getClass().getResource("regscene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(reg);
		stage.setScene(scene);
		stage.show();
	}
	
	public void patientLogin(ActionEvent event) throws IOException {
		System.out.print("login!!!\n");
		String username = nameField.getText();
		String password = PasswordField.getText();
		BackEnd.patientLogin(username, password);
	}
	
	
}
