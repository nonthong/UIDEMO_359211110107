package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable{
    private loginModel loginModel = new loginModel();

    @FXML
    private JFXTextField Username;

    @FXML
    private Label btnlogin;

    @FXML
    private Label loginStatus;

    @FXML
    private JFXPasswordField Password;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (this.loginModel.isDatabaseConnetcion())
            this dbStatus.setText("connected to db");
    }else{

    }
}//class
