package binsorter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label etiqueta = new Label("Hola, BinSorter A.M.G.");
        Scene escena = new Scene(etiqueta, 400, 300);
        stage.setTitle("BinSorter A.M.G.");
        stage.setScene(escena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}