package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Keyboard {
    Controller c;
    Button btn[] ;

    @FXML
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @FXML
    private Button change ;
    @FXML
    private Button send;
    private Random ran = new Random(9);
    @FXML
    private PasswordField ps;

    public void setC(Controller c) {
        this.c = c;
    }

    public void setBtn(Button[] j){
        this.btn = j;
    }


    public void ran(ActionEvent event){
        Button button = (Button) event.getSource();
        ps.setText(ps.getText()+button.getText());
    }
    @FXML
    public void change(){
//        btn1.setText(Integer.toString(ran.nextInt(10)));
//        btn2.setText(Integer.toString(ran.nextInt(10)));
//        btn3.setText(Integer.toString(ran.nextInt(10)));
//        btn4.setText(Integer.toString(ran.nextInt(10)));
//        btn5.setText(Integer.toString(ran.nextInt(10)));
//        btn6.setText(Integer.toString(ran.nextInt(10)));
//        btn7.setText(Integer.toString(ran.nextInt(10)));
//        btn8.setText(Integer.toString(ran.nextInt(10)));
//        btn9.setText(Integer.toString(ran.nextInt(10)));
//        btn10.setText(Integer.toString(ran.nextInt(10)));

        System.out.println(ran.nextInt(10));
    }

    public void send(){
       c.password(ps.getText());
       Stage s =(Stage) ps.getScene().getWindow();
       s.close();
    }
}
