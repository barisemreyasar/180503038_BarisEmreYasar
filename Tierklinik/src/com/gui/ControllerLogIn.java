package com.gui;

import com.company.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class ControllerLogIn implements Initializable {
    @FXML
    private Label label;

    @FXML
    public Button loginButton;

    @FXML
    public TextField nameTextField;

    @FXML
    public PasswordField passwordTextField;

    @FXML
    public ImageView imageView;

    @FXML
    public Button closeButton;
    @FXML
            public Label warningLabel;

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @FXML
    void loginButtonAction(ActionEvent event) {
        String uname = nameTextField.getText();
        String pass = passwordTextField.getText();
        DBImporter im = new DBImporter();
        User user = im.getUserObjekt(uname, pass);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "Fehler beim Einloggen!");
            nameTextField.setText("");
            passwordTextField.setText("");
            nameTextField.requestFocus();

        } else {
            try {
                JOptionPane.showMessageDialog(null, "Einloggen erfolgreich!");
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("LoggedIn.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.setTitle("Beta Veterinaer Klinik Aufnahmesystem");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void cancelButtonAction(ActionEvent event){
        Stage stage= (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
