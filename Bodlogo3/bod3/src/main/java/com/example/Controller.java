package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private TextField txtN;

    @FXML
    private AnchorPane txtNiinUtga;

    @FXML
    private TextField txtP;

    @FXML
    private TextField txtQ;

    @FXML
    private TextField txtUtga;

    @FXML
    private TextField txt_ap;

    @FXML
    private TextField txt_aq;

    @FXML
    void onClickBodoh(ActionEvent event) {
        int p = Integer.parseInt(txtP.getText());
        int ap = Integer.parseInt(txt_ap.getText());
        int q = Integer.parseInt(txtQ.getText());
        int aq = Integer.parseInt(txt_aq.getText());

        int n = Integer.parseInt(txtN.getText());
        int d = (aq - ap) / (q - p);
        int an = ap + (n - p) * d;

        txtUtga.setText(String.valueOf(an));
    }

}
