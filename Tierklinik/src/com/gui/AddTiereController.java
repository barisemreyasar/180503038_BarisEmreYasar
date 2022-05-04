package com.gui;

import com.company.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class AddTiereController  {

    @FXML
    public TextField idTextField;
    @FXML
    public TextField nameTextField;
    @FXML
    public TextField nachnameTextfield;
    @FXML
    public TextField tnTextField;
    @FXML
    public Button addPatientButton;
    @FXML
    public TextField chipnummerTextField;


    @FXML
    void addTiere(ActionEvent event) {
        int id = Integer.parseInt(idTextField.getText());
        String name = nameTextField.getText();
        String nname = nachnameTextfield.getText();
        String tn = tnTextField.getText();
        int cn=Integer.parseInt(chipnummerTextField.getText());
        DBImporter im = new DBImporter();
        if (id == 0 || name.equals("") || nname.equals("") || tn.equals("") || cn==0) {
            JOptionPane.showMessageDialog(null, "Fehler beim Hinzufuegen");
        } else {
            int result = im.addTiere(id, name, nname, tn,cn);
            if (result == -1) JOptionPane.showMessageDialog(null, "Besitzer existiert!");
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Besitzer hinzugefuegt!");
                nameTextField.setText("");
                idTextField.setText("");
                nachnameTextfield.setText("");
                tnTextField.setText("");
                chipnummerTextField.setText("");
            }
        }
    }

    @FXML
    void redLoggedIn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("LoggedIn.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setTitle("Beta Veterinär Klinik Aufnahmesystem");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

