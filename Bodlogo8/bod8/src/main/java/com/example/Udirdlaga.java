package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Udirdlaga {

    @FXML
    private CheckBox CheckBox1;

    @FXML
    private CheckBox CheckBox10;

    @FXML
    private CheckBox CheckBox11;

    @FXML
    private CheckBox CheckBox12;

    @FXML
    private CheckBox CheckBox2;

    @FXML
    private CheckBox CheckBox3;

    @FXML
    private CheckBox CheckBox4;

    @FXML
    private CheckBox CheckBox5;

    @FXML
    private CheckBox CheckBox6;

    @FXML
    private CheckBox CheckBox7;

    @FXML
    private CheckBox CheckBox8;

    @FXML
    private CheckBox CheckBox9;

    @FXML
    private Button btnHarah;

    @FXML
    private TextField txtUliral;

    @FXML
    void onClickHarah(ActionEvent event) {
    int count = 0;

    if (CheckBox1.isSelected()) count++;
    if (CheckBox2.isSelected()) count++;
    if (CheckBox3.isSelected()) count++;
    if (CheckBox4.isSelected()) count++;
    if (CheckBox5.isSelected()) count++;
    if (CheckBox6.isSelected()) count++;
    if (CheckBox7.isSelected()) count++;
    if (CheckBox8.isSelected()) count++;
    if (CheckBox9.isSelected()) count++;
    if (CheckBox10.isSelected()) count++;
    if (CheckBox11.isSelected()) count++;
    if (CheckBox12.isSelected()) count++;

    if (count != 1) {
        txtUliral.setText("1 sar songono uu");
        return;
    }

    if (CheckBox1.isSelected() || CheckBox11.isSelected() || CheckBox12.isSelected()) {
        txtUliral.setText("Winter");
    }
    else if (CheckBox2.isSelected() || CheckBox3.isSelected() || CheckBox4.isSelected()) {
        txtUliral.setText("Spring");
    }
    else if (CheckBox5.isSelected() || CheckBox6.isSelected() || CheckBox7.isSelected()) {
        txtUliral.setText("Summer");
    }
    else if (CheckBox8.isSelected() || CheckBox9.isSelected() || CheckBox10.isSelected()) {
        txtUliral.setText("Autumn");
    }

    }

}

