import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.File;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import java.awt.*;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    @FXML
    private Button closeButton;
    @FXML
    private Label registrationMessageLabel;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField nachnameTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField telefonnummerTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void closeButtonAction(ActionEvent event){
        Stage stage= (Stage) closeButton.getScene().getWindow();
        stage.close();
        Platform.exit();
    }
    public void registerButtonAction(ActionEvent event){
        registrationMessageLabel.setText("registration successful");
    }

    public void registerUser(){
        DatabaseConnection connectNow=new DatabaseConnection();
        Connection connectDB= connectNow.getConnection();
        String name=nameTextField.getText();
        String nachname=nachnameTextField.getText();
        String id=usernameTextField.getText();
        String email=emailTextField.getText();
        String telefonNummer=telefonnummerTextField.getText();
        String password=passwordTextField.getText();

        String insertFields="INSERT INTO user_account(id,name,nachname,email,telefonnummer,password) VALUES('";
        String insertValues=id+"','"+name+"','"+nachname+"','"+email+"','"+telefonNummer+"','"+password+"')";
        String insertToRegister=insertFields+insertValues;
        try{
            Statement statement= connectDB.createStatement();
            statement.executeUpdate(insertToRegister);
            registrationMessageLabel.setText("registration successfull");
        }catch (Exception e){
                e.printStackTrace();
                e.getCause();
        }
    }
}
