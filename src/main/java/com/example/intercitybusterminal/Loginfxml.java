package com.example.intercitybusterminal;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginfxml
{
    @javafx.fxml.FXML
    private TextField UsernameTextfield;
    @javafx.fxml.FXML
    private PasswordField PasswordField;
    @javafx.fxml.FXML
    private ComboBox <String> UsertypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LoginOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateanAccountOnAction(ActionEvent actionEvent) {
    }

    public PasswordField getPasswordField() {
        return PasswordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        PasswordField = passwordField;
    }
}