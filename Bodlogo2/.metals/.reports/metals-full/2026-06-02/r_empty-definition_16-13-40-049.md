error id: file:///C:/Dadlaga/Bodlogo/Bodlogo2/bodlogo2/src/main/java/com/example/Controller.java:_empty_/TextField#
file:///C:/Dadlaga/Bodlogo/Bodlogo2/bodlogo2/src/main/java/com/example/Controller.java
empty definition using pc, found symbol in pc: _empty_/TextField#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 214
uri: file:///C:/Dadlaga/Bodlogo/Bodlogo2/bodlogo2/src/main/java/com/example/Controller.java
text:
```scala
package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtMinute;

    @FXML
    private T@@extField txtSecond;

    @FXML
    void onClickBodoh(ActionEvent event) {

        int second = Integer.parseInt(txtSecond.getText());

        int minute = second / 60;
        int remainSecond = second % 60;

        txtMinute.setText(minute + " " + remainSecond);
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/TextField#