
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

public class LoginController implements Initializable {
    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;


    public void cancelButtonAction(ActionEvent event){
        Stage stage=(Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void loginButtonAction(ActionEvent event){


        loginMessageLabel.setText("trying to login");

        if(usernameTextField.getText().isEmpty()==false&& enterPasswordField.getText().isEmpty()==false){
            validateLogin();
        }else{
            loginMessageLabel.setText("please enter somethin");
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File brandingFile=new File("images/kedi-kopek-bayrakli-veteriner.png");
        Image brandingImage= new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

    }
    public void validateLogin(){
        DatabaseConnection connectNow= new DatabaseConnection();
        Connection connectDB =connectNow.getConnection();

        String verifyLogin="SELECT count(1) FROM user_account WHERE id='"+ usernameTextField.getText() + "'AND password=" +enterPasswordField.getText();
        try{
            Statement statement= connectDB.createStatement();
            ResultSet queryResult= statement.executeQuery(verifyLogin);
            while(queryResult.next()){
                if(queryResult.getInt(1)==1){
                    loginMessageLabel.setText("okey");
                    createAccountForm();
                }else{
                    loginMessageLabel.setText("wrong");
                }
            }

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();


        }
    }

    public void createAccountForm(){
        try{
            Parent root= FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage registerStage=new Stage();
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setScene(new Scene(root, 520,400));
            registerStage.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }


}
