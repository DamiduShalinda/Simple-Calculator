package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.jetbrains.annotations.NotNull;

public class HelloController {

    private Label instructions;
    @FXML
    private Label answer;
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private Button add;
    @FXML
    private Button minus;
    @FXML
    private Button multiply;
    @FXML
    private Button divide;

    float num1, num2, totalNum;
    String totalNumS;
    @FXML
    private Label welcomeText;

    @FXML
    protected void addingNumbers(){
                num1=Float.parseFloat(number1.getText());
                num2=Float.parseFloat(number2.getText());
                totalNum = num1 + num2;
                totalNumS = Float.toString(totalNum);
                answer.setText(totalNumS);
    }

    @FXML
    protected void minusNumbers(){
        num1=Float.parseFloat(number1.getText());
        num2=Float.parseFloat(number2.getText());
        totalNum = num1 - num2;
        totalNumS = Float.toString(totalNum);
        answer.setText(totalNumS);
    }

    @FXML
    protected void multiplyNumbers(){
        num1=Float.parseFloat(number1.getText());
        num2=Float.parseFloat(number2.getText());
        totalNum = num1 * num2;
        totalNumS = Float.toString(totalNum);
        answer.setText(totalNumS);
    }
    @FXML
    protected void divideNumbers(){
        num1=Float.parseFloat(number1.getText());
        num2=Float.parseFloat(number2.getText());
        totalNum = num1 / num2;
        totalNumS = Float.toString(totalNum);
        answer.setText(totalNumS);
    }


    @FXML
    void add(@NotNull KeyEvent event){
        if (event.getCode() == KeyCode.DELETE){
            number1.setText("");
            number2.setText("");
            answer.setText("");
            instructions.setText("f u");

        }
    }



