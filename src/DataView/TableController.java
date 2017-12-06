package DataView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TableController extends Application {


    public static Stage stage= new Stage();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("table.fxml"));
        stage.setTitle("Liste Des Examens");
        stage.setScene(new Scene(root, 900 , 600));
        stage.show();
        System.out.println("table Controller");
    }


    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init");
    }
}
