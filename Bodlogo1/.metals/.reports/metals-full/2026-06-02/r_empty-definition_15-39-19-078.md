error id: file:///C:/Dadlaga/Bodlogo/Bodlogo1/bodlogo1/src/main/java/com/example/Controller.java:java/lang/String#
file:///C:/Dadlaga/Bodlogo/Bodlogo1/bodlogo1/src/main/java/com/example/Controller.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 399
uri: file:///C:/Dadlaga/Bodlogo/Bodlogo1/bodlogo1/src/main/java/com/example/Controller.java
text:
```scala
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
                
        @@String input = txtUrt.getText();
        
        String[] parts = input.split(" ");

        int urt = Integer.parseInt(parts[0]);
        int orgon = Integer.parseInt(parts[1]);

        int talbai = urt * orgon;
        int perimeter = 2 * (urt + orgon);

        txtTalbaiPrimetr.setText(talbai + " " + perimeter);
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#