package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField txtJijigUseg;

    @FXML
    public void initialize() {

        for(char c = 'A'; c <= 'Z'; c++) {
            comboBox.getItems().add(String.valueOf(c));
        }

    }

    @FXML
    void onClickShiljuuleh(ActionEvent event) {
        String tomUseg = comboBox.getValue();

        if(tomUseg != null) {
            txtJijigUseg.setText(tomUseg.toLowerCase());
        }


    }

}
