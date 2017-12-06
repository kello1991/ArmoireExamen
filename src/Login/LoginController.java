package Login;

import DataView.TableController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

public class LoginController extends Application{

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Label errorLbl;


    private final String user = "user";
    private final String pass = "user";

    private Stage stage= new Stage();


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        stage.setTitle("Login");
        stage.setScene(new Scene(root, 900 , 600));
        stage.show();
        userName.setText("userName");


        this.stage= (Stage)stage.getScene().getWindow();

    }


    @Override
    public void init() throws Exception {
        super.init();
        userName = new TextField();
        password = new PasswordField();
    }

    @FXML
    public  void login() throws Exception {
        if (userName.getText().equals(user)&&password.getText().equals(pass)){


          TableController tbl= new TableController();
          tbl.start(tbl.stage);
            stage= (Stage) anchorPane.getScene().getWindow();
            stage.close();
        }
        else {

            errorLbl.setText("Verifier Votre Nom Utilisateur et Mot De Passe");

        }

    }

    @FXML
    public void reset() {
        userName.setText("");
        password.setText("");
    }


}
