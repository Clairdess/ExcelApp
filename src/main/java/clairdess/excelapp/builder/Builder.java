package clairdess.excelapp.builder;

public interface Builder {
    Builder setName(String Name);
    Builder setPrice(String Price);
    Builder setStock(String Stock);
    Builder setSupplier(String Supplier);
    Builder setMinQty(String MinQty);
    Builder setSeries(String Series);
    Builder setPackage(String Package);
    Builder setPartStatus(String PartStatus);
    Builder setCircuitType(String CircuitType);
    Builder setResistance(String Resistance);
    Builder setNumberOfResistors(String NumberOfResistors);
    Builder setResistorsMatchingRatio(String ResistorsMatchingRatio);
    Builder setResistorRatioDrift(String ResistorRatioDrift);
    Builder setNumberOfPins(String NumberOfPins);
    Builder setPowerPerElement(String PowerPerElement);
    Builder setTempCoeff(String TempCoeff);
    Builder setOperatingTemp(String OperatingTemp);
}
