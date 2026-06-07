package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Udirdlaga {

    @FXML
    private TextField txtHariu;

    @FXML
    private TextField txtShagainToo;

    @FXML
    void onClickBodoh(ActionEvent event) {
        int k = Integer.parseInt(txtShagainToo.getText());

        long result = (long)( (k + 3L) * (k + 2L) * (k + 1L) / 6 );

    txtHariu.setText(String.valueOf(result));
    }

}
