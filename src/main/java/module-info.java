module clairdess.excelapp {
    requires javafx.controls;
    requires javafx.fxml;


    requires org.controlsfx.controls;

    opens clairdess.excelapp to javafx.fxml;
    exports clairdess.excelapp;
}