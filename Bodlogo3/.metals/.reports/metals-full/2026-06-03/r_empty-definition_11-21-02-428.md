error id: file:///C:/Dadlaga/Bodlogo/Bodlogo3/bod3/src/main/java/com/example/App.java:_empty_/Scene#setRoot#
file:///C:/Dadlaga/Bodlogo/Bodlogo3/bod3/src/main/java/com/example/App.java
empty definition using pc, found symbol in pc: _empty_/Scene#setRoot#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 591
uri: file:///C:/Dadlaga/Bodlogo/Bodlogo3/bod3/src/main/java/com/example/App.java
text:
```scala
package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot@@(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Scene#setRoot#