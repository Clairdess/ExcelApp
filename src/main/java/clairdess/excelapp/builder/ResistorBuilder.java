package clairdess.excelapp.builder;

import clairdess.excelapp.model.Resistor;

public class ResistorBuilder implements Builder {
    private String Name;
    private String Price;
    private String Stock;
    private String Supplier;
    private String MinQty;
    private String Series;
    private String Package;
    private String PartStatus;
    private String CircuitType;
    private String Resistance;
    private String NumberOfResistors;
    private String ResistorsMatchingRatio;
    private String ResistorRatioDrift;
    private String NumberOfPins;
    private String PowerPerElement;
    private String TempCoeff;
    private String OperatingTemp;

    public Resistor getResistor() {
        return new Resistor(
                Name, Price, Stock, Supplier, MinQty,
                Series, Package, PartStatus, CircuitType, Resistance,
                NumberOfResistors, ResistorsMatchingRatio, ResistorRatioDrift,
                NumberOfPins, PowerPerElement, TempCoeff, OperatingTemp);
    }

    @Override
    public Builder setName(String Name) {
        this.Name = Name;
        return this;
    }

    @Override
    public Builder setPrice(String Price) {
        this.Price = Price;
        return this;
    }

    @Override
    public Builder setStock(String Stock) {
        this.Stock = Stock;
        return this;
    }

    @Override
    public Builder setSupplier(String Supplier) {
        this.Supplier = Supplier;
        return this;
    }

    @Override
    public Builder setMinQty(String MinQty) {
        this.MinQty = MinQty;
        return this;
    }

    @Override
    public Builder setSeries(String Series) {
        this.Series = Series;
        return this;
    }

    @Override
    public Builder setPackage(String Package) {
        this.Package = Package;
        return this;
    }

    @Override
    public Builder setPartStatus(String PartStatus) {
        this.PartStatus = PartStatus;
        return this;
    }

    @Override
    public Builder setCircuitType(String CircuitType) {
        this.CircuitType = CircuitType;
        return this;
    }

    @Override
    public Builder setResistance(String Resistance) {
        this.Resistance = Resistance;
        return this;
    }

    @Override
    public Builder setNumberOfResistors(String NumberOfResistors) {
        this.NumberOfResistors = NumberOfResistors;
        return this;
    }

    @Override
    public Builder setResistorsMatchingRatio(String ResistorsMatchingRatio) {
        this.ResistorsMatchingRatio = ResistorsMatchingRatio;
        return this;
    }

    @Override
    public Builder setResistorRatioDrift(String ResistorRatioDrift) {
        this.ResistorRatioDrift = ResistorRatioDrift;
        return this;
    }

    @Override
    public Builder setNumberOfPins(String NumberOfPins) {
        this.NumberOfPins = NumberOfPins;
        return this;
    }

    @Override
    public Builder setPowerPerElement(String PowerPerElement) {
        this.PowerPerElement = PowerPerElement;
        return this;
    }

    @Override
    public Builder setTempCoeff(String TempCoeff) {
        this.TempCoeff = TempCoeff;
        return this;
    }

    @Override
    public Builder setOperatingTemp(String OperatingTemp) {
        this.OperatingTemp = OperatingTemp;
        return this;
    }
}
