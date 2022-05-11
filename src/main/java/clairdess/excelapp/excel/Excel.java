package clairdess.excelapp.excel;

import clairdess.excelapp.data.Parser;
import clairdess.excelapp.model.Resistor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Excel {
    static ArrayList<String> names = new ArrayList<>();
    static {
        names.add("Part Number");
        names.add("ID");
        names.add("Price");
        names.add("Stock");
        names.add("Supplier");
        names.add("MinQty");
        names.add("Series");
        names.add("Package");
        names.add("PartStatus");
        names.add("CircuitType");
        names.add("Resistance (Ohms)");
        names.add("NumberOfResistors");
        names.add("ResistorsMatchingRatio");
        names.add("ResistorRatioDrift");
        names.add("NumberOfPins");
        names.add("PowerPerElement");
        names.add("TemperatureCoefficient");
        names.add("OperatingTemperature");
    }

    public static String CreateEmptyExcel(String Name, String FilePath) {
        try {
            String filename = FilePath + Name;
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet("Lmao");
            Row rowFirst = sheet.createRow(0);
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
                rowFirst.createCell(i).setCellValue(names.get(i));
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            return "Your excel file has been generated";
        } catch (FileNotFoundException var11) {
            return "Error in Path";
        } catch (Exception var12) {
            return "Error";
        }
    }

    public static String CreateExcel(List<Resistor> resistorList, String Name, String FilePath) {
        try {
            String filename = FilePath + "/" + Name;
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet("FirstSheet");

            /*
            TODO adding creating and add some data from website

            for (int i = 0; i < resistorList.size(); i++) {
                Resistor temp = resistorList.get(i);
                Row row = sheet.createRow(i);
                row.createCell(0).setCellValue(temp.getName());
                row.createCell(1).setCellValue(sheet.getLastRowNum());
                row.createCell(2).setCellValue(temp.getPrice());
                row.createCell(3).setCellValue(temp.getStock());
                row.createCell(4).setCellValue(temp.getSupplier());
                row.createCell(5).setCellValue(temp.getMinQty());
                row.createCell(6).setCellValue(temp.getSeries());
                row.createCell(7).setCellValue(temp.getPackage());
                row.createCell(8).setCellValue(temp.getPart_status());
                row.createCell(9).setCellValue(temp.getCircuitType());
                row.createCell(10).setCellValue(temp.getResistance());
                row.createCell(11).setCellValue(temp.getNumberOfResistors());
                row.createCell(12).setCellValue(temp.getResistorsMatchingRatio());
                row.createCell(13).setCellValue(temp.getResistorRatioDrift());
                row.createCell(14).setCellValue(temp.getNumberOfPins());
                row.createCell(15).setCellValue(temp.getPowerPerElement());
                row.createCell(16).setCellValue(temp.getTemperatureCoefficient());
                row.createCell(17).setCellValue(temp.getOperatingTemperature());
            }*/

            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            return "Your excel file has been generated";
        } catch (FileNotFoundException var11) {
            return "Error in Path";
        } catch (Exception var12) {
            return "Error";
        }
    }


    /*
    TODO this method will not working
    public static void Finding(String name, String Url, String NameOfClass,
                               String path) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(path + "/" + name + ".xls");
            Workbook wb = new HSSFWorkbook(fis);
            Sheet sheet = wb.getSheetAt(0);
            boolean isUpdated = false;

            for (int i = 2; i < sheet.getLastRowNum() + 2; ++i) {
                CellReference cellReference = new CellReference("B" + i);
                Row row = sheet.getRow(cellReference.getRow());
                Cell cell = row.getCell(cellReference.getCol());
                if (cell == null) {
                    isUpdated = true;
                    CellReference cellReference1 = new CellReference("A" + i);
                    Row rowA = sheet.getRow(cellReference1.getRow());
                    Cell cellA = rowA.getCell(cellReference1.getCol());
                    DataFormatter formatter = new DataFormatter();
                    String strValue = formatter.formatCellValue(cellA);
                    Resistor a = Parser.FindingResistor();
                    Row rowHead = sheet.createRow((short) (i - 1));
                }
            }

            if (isUpdated) {
                FileOutputStream fileOut = new FileOutputStream(path + "/" + name + ".xls");
                wb.write(fileOut);
                fileOut.close();
                wb.close();
            }
        } catch (NullPointerException var19) {
            System.out.println("Error ");
        }

    }*/
}