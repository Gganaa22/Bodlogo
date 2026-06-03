package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtPerimetr;

    @FXML
    private TextField txtTalbai;

    @FXML
    private TextField txtUrgun;

    @FXML
    private TextField txtUrt;

    @FXML
    void onClickBodoh(ActionEvent event) {
                
    int urt = Integer.parseInt(txtUrt.getText());
    int urgun = Integer.parseInt(txtUrgun.getText());

    int talbai = urt * urgun;
    int perimetr = 2 * (urt + urgun);

    txtTalbai.setText(String.valueOf(talbai));
    txtPerimetr.setText(String.valueOf(perimetr));
    }
}