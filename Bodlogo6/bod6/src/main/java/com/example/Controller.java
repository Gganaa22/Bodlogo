package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtNtoo;

    @FXML
    private TextField txtSum;

    @FXML
    void onClickBodoh(ActionEvent event) {

        long n = Long.parseLong(txtNtoo.getText());

        long k = (n + 1) / 2;
        long sum = k * k;

        txtSum.setText(String.valueOf(sum));
    }
}