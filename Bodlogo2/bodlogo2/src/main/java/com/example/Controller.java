package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtMinute;

    @FXML
    private TextField txtSecond;

    @FXML
    private TextField txtSecond2;

    @FXML
    void onClickBodoh(ActionEvent event) {

        int second = Integer.parseInt(txtSecond.getText());

        int minute = second / 60;
        int remainSecond = second % 60;

        txtMinute.setText(String.valueOf(minute));
        txtSecond2.setText(String.valueOf(remainSecond));
    }
}