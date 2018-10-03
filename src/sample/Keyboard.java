package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Keyboard {
    @FXML
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    private Button change ;
    private Random ran = new Random(9);

    @FXML
    private void ran(ActionEvent event){
//        for (int i = 0 ;i<10 ;i++){
//            btn1.setText(ran.toString());
//        }
    }

    public void change(){
        btn1.setText("1");
        System.out.println(ran);
    }
}
