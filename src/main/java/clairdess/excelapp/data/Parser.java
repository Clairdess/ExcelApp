package clairdess.excelapp.data;

import clairdess.excelapp.model.Resistor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {

    public static final String URL = "https://www.digikey.com/en/products/filter/resistor-networks-arrays/50?s=N4IgrCBcoA5QjAGhDOl4AYMF9tA";

    public static List<Resistor> getListResistors() throws IOException {
        List<Resistor> resistorList = new ArrayList<>();
        Document doc = Jsoup.connect(URL).get();
        Elements h1Elements = doc.getElementsByAttributeValue("class", "MuiTableRow-root jss317");
        h1Elements.forEach((h1Element) -> {
            String Name = h1Element.child(1).child(0).child(2).child(0).text();
            String Price = h1Element.child(2).text();
            String Stock = h1Element.child(3).text();
            String Supplier = h1Element.child(5).text();
            String MinQty = h1Element.child(3).text();
            String Series = h1Element.child(8).text();
            String Package = h1Element.child(9).text();
            String PartStatus = h1Element.child(10).text();
            String CircuitType = h1Element.child(11).text();
            String Resistance = h1Element.child(12).text();
            String NumberOfResistors = h1Element.child(14).text();
            String ResistorsMatchingRatio = h1Element.child(15).text();
            String ResistorRatioDrift = h1Element.child(16).text();
            String NumberOfPins = h1Element.child(17).text();
            String PowerPerElement = h1Element.child(18).text();
            String TemperatureCoefficient = h1Element.child(19).text();
            String OperatingTemperature = h1Element.child(20).text();
            resistorList.add(new Resistor(Name, Price, Stock, Supplier, MinQty,
                    Series, Package, PartStatus, CircuitType, Resistance, NumberOfResistors,
                    ResistorsMatchingRatio, ResistorRatioDrift, NumberOfPins,
                    PowerPerElement, TemperatureCoefficient, OperatingTemperature));

        });
        //resistorList.add(new Resistor("Name", "Price", "Stock", "Supplier", "MinQty",
        //        "Series", "Package", "PartStatus", "CircuitType", "Resistance", "NumberOfResistors",
        //        "ResistorsMatchingRatio", "ResistorRatioDrift", "NumberOfPins",
        //        "PowerPerElement", "TemperatureCoefficient", "OperatingTemperature"));
        return resistorList;
    }

    /*
    TODO add method which find resistor by name
    public static Resistor FindingResistor() throws IOException {
        for (int i = 0; i < 1000; ++i) {
        }
        return null;
    }*/
}
