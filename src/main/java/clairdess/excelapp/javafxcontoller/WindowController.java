package clairdess.excelapp.javafxcontoller;

import clairdess.excelapp.excel.Excel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WindowController {
    @FXML
    TextField name;
    @FXML
    TextField path;
    @FXML
    TextArea message;

    final String WebSiteURL = "https://www.digikey.com/en/products/filter/resistor-networks-arrays/50";

    public WindowController() {
    }

    public void CreateExcel(ActionEvent actionEvent) throws IOException {
        if (this.name.getText().isEmpty()) {
            this.message.setText("Error. Name is empty");
            this.message.setVisible(true);
        } else if (this.path.getText().isEmpty()) {
            this.message.setText("Error. Path is empty");
            this.message.setVisible(true);
        } else {
            try {
                String answer = Excel.CreateEmptyExcel(name.getText(), path.getText());
                if (this.message.getText().equals("")) {
                    this.message.setText(answer);
                } else {
                    TextArea var10000 = this.message;
                    String var10001 = this.message.getText();
                    var10000.setText(var10001 + "\n" + answer);
                }
            } catch (IllegalArgumentException var3) {
                this.message.setText("Error. URL is wrong");
            }
        }

    }

    public void UpdateExcel(ActionEvent actionEvent) throws IOException {
        //TODO add logic
        // System.out.println(Parser.getListResistors());
        //this.message.setText(this.message.getText() + "\n Your excel file has been updated");
    }

    public void OpenFile(ActionEvent actionEvent) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                String nameFile = this.path.getText();
                desktop.open(new File(nameFile + "\\" + this.name.getText()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (IllegalArgumentException ex) {
            if (this.message.getText().equals("")) {
                this.message.setText(" The file doesn't exist");
            } else {
                this.message.setText(this.message.getText() + "\n The file doesn't exist");
            }
        }
    }

    public void SelectFile(ActionEvent actionEvent){
        JFileChooser fileChoose = new JFileChooser();
        int ret = fileChoose.showDialog(null, "Open file");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileChoose.getSelectedFile();
            path.setText(file.getPath().replaceAll(file.getName(),""));
            name.setText(file.getName());
        }
    }
}
