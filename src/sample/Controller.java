package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TextField tf1;

    @FXML
    public void account(){

    }
    @FXML
    public void password(){

    }
    @FXML
    public void login(){

    }
    @FXML
    public void keyboard(ActionEvent event) throws Exception{
        Parent root2 = FXMLLoader.load(getClass().getResource("keysample.fxml"));
        Scene scene = new Scene(root2);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

}
