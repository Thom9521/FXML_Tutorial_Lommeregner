package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class Controller {

    @FXML
    private Button btnadd;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmul;
    @FXML
    private Button btndiv;
    @FXML
    private Button btnclear;

    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private Label lblanswer;

    @FXML
    private void handleButtonAction(ActionEvent e) {
        int num1, num2, answer;
        char symbol;
        //e tells us which button was clicked
        if(e.getSource()==btnclear)
        {
            txtnum1.setText("");
            txtnum2.setText("");
            lblanswer.setText("?");
            txtnum1.requestFocus();
            return;
        }
        //read numbers in from textfields
        num1=Integer.parseInt(txtnum1.getText());
        num2=Integer.parseInt(txtnum2.getText());
        if(e.getSource()==btnadd)
        {
            symbol='+';
            answer=num1+num2;
        }
        else if(e.getSource()==btnsub)
        {
            symbol='-';
            answer=num1-num2;
        }
        else if(e.getSource()==btnmul)
        {
            symbol='x';
            answer=num1*num2;
        }
        else
        {
            symbol='/';
            answer=num1/num2;
        }
        //display answer
        lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
    }
}



