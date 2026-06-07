package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private RadioButton radiobtnBuurahaar;

    @FXML
    private RadioButton radiobtnOsohoor;

    @FXML
    private TextField txtGurav;

    @FXML
    private TextField txtGuravUrdun;

    @FXML
    private TextField txtHoyr;

    @FXML
    private TextField txtHoyrUrdun;

    @FXML
    private TextField txtNeg;

    @FXML
    private TextField txtNegUrdun;

    @FXML
    void onClickOsohoor() {

    int a = Integer.parseInt(txtNeg.getText());
    int b = Integer.parseInt(txtHoyr.getText());
    int c = Integer.parseInt(txtGurav.getText());

    int temp;

    if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }

    if (a > c) {
        temp = a;
        a = c;
        c = temp;
    }

    if (b > c) {
        temp = b;
        b = c;
        c = temp;
    }

    txtNegUrdun.setText(String.valueOf(a));
    txtHoyrUrdun.setText(String.valueOf(b));
    txtGuravUrdun.setText(String.valueOf(c));
}

    @FXML
    void onClickBuurahaar() {

    int a = Integer.parseInt(txtNeg.getText());
    int b = Integer.parseInt(txtHoyr.getText());
    int c = Integer.parseInt(txtGurav.getText());

    int temp;

    if (a < b) {
        temp = a;
        a = b;
        b = temp;
    }

    if (a < c) {
        temp = a;
        a = c;
        c = temp;
    }

    if (b < c) {
        temp = b;
        b = c;
        c = temp;
    }

    txtNegUrdun.setText(String.valueOf(a));
    txtHoyrUrdun.setText(String.valueOf(b));
    txtGuravUrdun.setText(String.valueOf(c));
}

}
