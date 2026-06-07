package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Udirdlaga {

    @FXML
    private Button btnBodoh;

    @FXML
    private RadioButton radiobtnTegshToo;

    @FXML
    private TextField txtNiilber;

    @FXML
    private TextField txtTegshToonuud;

    @FXML
    private TextField txtTooGurav;

    @FXML
    private TextField txtTooHoyr;

    @FXML
    private TextField txtTooNeg;

    @FXML
    void onClickBodoh(ActionEvent event) {
    int too1 = Integer.parseInt(txtTooNeg.getText());
    int too2 = Integer.parseInt(txtTooHoyr.getText());
    int too3 = Integer.parseInt(txtTooGurav.getText());

    int niilber = 0;

    if (too1 % 2 == 0) {
        niilber += too1;
    }

    if (too2 % 2 == 0) {
        niilber += too2;
    }

    if (too3 % 2 == 0) {
        niilber += too3;
    }

    txtNiilber.setText(String.valueOf(niilber));
    }
    @FXML
    void onClickTegshToonuud(ActionEvent event) {

    if (!radiobtnTegshToo.isSelected()) {
        txtTegshToonuud.clear();
        return;
    }

    int too1 = Integer.parseInt(txtTooNeg.getText());
    int too2 = Integer.parseInt(txtTooHoyr.getText());
    int too3 = Integer.parseInt(txtTooGurav.getText());

    String tegshToonuud = "";

    if (too1 % 2 == 0) {
        tegshToonuud += too1;
    }

    if (too2 % 2 == 0) {
        if (!tegshToonuud.isEmpty()) {
            tegshToonuud += ", ";
        }
        tegshToonuud += too2;
    }

    if (too3 % 2 == 0) {
        if (!tegshToonuud.isEmpty()) {
            tegshToonuud += ", ";
        }
        tegshToonuud += too3;
    }

    txtTegshToonuud.setText(tegshToonuud);
}

}
