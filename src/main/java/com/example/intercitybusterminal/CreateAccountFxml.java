package com.example.intercitybusterminal;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CreateAccountFxml
{
    @javafx.fxml.FXML
    private Label UserIDLabel;
    @javafx.fxml.FXML
    private TextField NumberTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private PasswordField Passwordfield;
    @javafx.fxml.FXML
    private ComboBox <String> usertypeComboBox;
    @javafx.fxml.FXML
    private TextField EmailTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void OnActionSignupButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OnActionLoginButton(ActionEvent actionEvent) {
    }
}