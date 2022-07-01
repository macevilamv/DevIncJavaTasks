package by.incubator.autopark;

public class VehicleType {
    private String typeName;
    private double taxCoefficient;

    VehicleType () {}

    VehicleType (String name, double taxation) {
        this.typeName = name;
        this.taxCoefficient = taxation;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName (String typeName) {
        this.typeName = typeName;
    }

    public double getTaxCoefficient() {
        return taxCoefficient;
    }

    public void setTaxCoefficient (double taxCoefficient) {
        this.taxCoefficient = taxCoefficient;
    }

    public void display () {
        System.out.println("TypeName= " + typeName + "\n" + "TaxCoefficient= " + taxCoefficient);
    }

    public void getString () {
        System.out.println(typeName +", " + "\""+ taxCoefficient +"\"");
    }

}
