package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {
    @FXML
    private TextField tf1;
    @FXML
    private PasswordField ps1;

    @FXML
    public void account(){

    }
    public void password(String p){
        ps1.setText(p);
    }
    @FXML
    public void login(){

    }
    @FXML
    public void keyboard(ActionEvent event) throws Exception{
//        Parent root2 = FXMLLoader.load(getClass().getResource("keysample.fxml"));
//        Scene scene = new Scene(root2);
        Stage stage = new Stage();

        FXMLLoader fload = new FXMLLoader(getClass().getResource("keysample.fxml"));
        Parent par = fload.load();

        Keyboard ctrl = fload.getController();
        ctrl.setC(Controller.this);
        Random ran = new Random();
        Button b[]= new Button[10];
        int a[] = new int[10];
        for (int i = 0 ;i<10 ; i++){
            b[i] = (Button) par.lookup("#btn"+Integer.toString(i+1));
            b[i].setText(Integer.toString(i));
        }
        ctrl.setBtn(b);


        stage.setScene(new Scene(par));
        stage.show();

    }
}