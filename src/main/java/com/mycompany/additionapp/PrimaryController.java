package com.mycompany.additionapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField numberOneTextField;
    @FXML
    private TextField numberTwoTextField;
    @FXML
    private Button CalculateButton;
    @FXML
    private Label sumLabel;
    
    @FXML
    private void calculateButtonClicked(ActionEvent event) {
        System.out.println("The calculate button was clicked");
        int sum;
        sum = Integer.parseInt(numberOneTextField.getText()) + Integer.parseInt(numberTwoTextField.getText());
        sumLabel.setText("" + sum);
        
    }
}
