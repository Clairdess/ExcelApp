package clairdess.excelapp;

import clairdess.excelapp.builder.ResistorBuilder;
import clairdess.excelapp.model.Resistor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();
        ResistorBuilder builder = new ResistorBuilder();
        builder.setName("1")
                .setPrice("2")
                .setStock("3")
                .setSupplier("4")
                .setMinQty("5")
                .setSeries("6")
                .setPackage("7")
                .setPartStatus("8")
                .setCircuitType("9")
                .setResistance("10")
                .setNumberOfResistors("11")
                .setResistorsMatchingRatio("12")
                .setResistorRatioDrift("13")
                .setNumberOfPins("14")
                .setPowerPerElement("15")
                .setTempCoeff("16")
                .setOperatingTemp("17");

        Resistor a = builder.getResistor();
        System.out.println(a);

    }
}