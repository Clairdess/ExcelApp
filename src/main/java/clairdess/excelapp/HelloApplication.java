package clairdess.excelapp;

import clairdess.excelapp.builder.ResistorBuilder;
import clairdess.excelapp.model.Resistor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage primaryStage) throws Exception {
        URL url = new File("src/main/resources/view.fxml").toURI().toURL();
        //URL xmlUrl = getClass().getResource("/view");
        Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Resistors");
        primaryStage.setScene(new Scene(root, 500.0D, 550.0D));
        primaryStage.show();
    }
}