package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Udirdlaga {

    @FXML
    private TextField txtTalbai;

    @FXML
    private TextField txtUrt;

    @FXML
    void onClickTalbaiOloh(ActionEvent event) {
        double urt = Double.parseDouble(txtUrt.getText());

        double pi = 3.141592;
        double radius = urt / (2 * pi);
        double talbai = radius * radius * pi;

        txtTalbai.setText(String.format("%.4f", talbai));
    }

}
