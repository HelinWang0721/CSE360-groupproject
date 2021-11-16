package com.example.phase3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import org.w3c.dom.Text;

public class DoctorController {
    @FXML private Label patientInfo;
    @FXML private TextField patient_name;
    @FXML private TextArea newInfo;
    @FXML private TextField pharmacy;
    @FXML private TextField drug_name;
    @FXML private TextField quantity;
    @FXML private TextField dosage;

    @FXML
    protected void onSearchClick() {
        String patientName = patient_name.getText();
        //add patient search and return information
        patientInfo.setText(patientName);//add information here
    }
    @FXML
    protected void onSubmitClick(){
        String patientNewInfo = newInfo.getText();
        System.out.print(patientNewInfo);
        //this part should have the method to add the patient information that doctor submit
    }
    @FXML
    protected void onSendClick(){
        String Pharmacy = pharmacy.getText();
        String DrugName = drug_name.getText();
        String Quantity = quantity.getText();
        String Dosage = dosage.getText();
        //the part should add the method to send them to pharmacy and save in patient information
    }
}