package by.incubator.autopark;

import java.util.Objects;

public class Vehicle implements Comparable <Vehicle>{

    private VehicleType type;
    private CarColor color;
    private String model;
    private String registrationNumber;
    private double mass;
    private int mileage;
    private int manufactureYear;


    Vehicle ()
    {
        type = new VehicleType("DEFAULT", 0);
        model = "DEFAULT";
        registrationNumber = "DEFAULT";
        manufactureYear = 0;
        color = CarColor.WHITE;
        registrationNumber = "DEFAULT";
        mass = 0.0;
    }

    public Vehicle (VehicleType type, CarColor color, String model, String registrationNumber, double mass,
                    int mileage, int manufactureYear)
    {
        setType (type);
        setColor (color);
        setModel (model);
        setRegistrationNumber (registrationNumber);
        setMass (mass);
        setMileage (mileage);
        setManufactureYear (manufactureYear);

    }

    public double getCalcTaxPerMonth () {
        return (this.mass * 0.0013) + (type.getTaxCoefficient() * 30) + 5;
    }

    @Override
    public String toString() {
        return type.getTypeName() + ", "
                + model + ", "
                + color + ", "
                + registrationNumber + ", "
                + mass + ", "
                + mileage + ", "
                + manufactureYear + ", "
                + getCalcTaxPerMonth();
    }

    @Override
    public boolean equals (Object o) {
        Vehicle that = (Vehicle) o;

        if (!(o instanceof Vehicle)) {
            return false;
        } else if (this.type == that.type && this.model == that.model) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(type, model);
    }

    @Override
    public int compareTo (Vehicle obj) {

        if (this.manufactureYear == ((Vehicle) obj).manufactureYear) {

            if (this.mileage == ((Vehicle) obj).mileage) {
                return 0;
            } else if (this.mileage > ((Vehicle) obj).mileage) {
                return 1;
            } else {
                return -1;
            }

        } else if (this.manufactureYear > ((Vehicle) obj).manufactureYear) {
            return 1;
        } else {
            return -1;
        }
    }

    public VehicleType getType() {
        return type;
    }

    public CarColor getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getMass() {
        return mass;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setModel (String model) {

        if (TechnicalSpecialist.validateModelName (model)) {
            this.model = model;
        } else {
            this.model = "DEFAULT";
        }

    }

    public void setRegistrationNumber (String registrationNumber) {

        if (TechnicalSpecialist.validateRegistrationNumber (registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "DEFAULT";
        }
    }

    public void setType (VehicleType type) {

        if (TechnicalSpecialist.validateVehicleType (type)) {
            this.type = type;
        } else {
            this.type = new VehicleType ("default", 0);
        }
    }

    public void setMass (double mass) {

        if (TechnicalSpecialist.validateWeight (mass)) {
            this.mass = mass;
        } else {
            this.mass = 0.0;
        }
    }

    public void setColor (CarColor color) {

        if (TechnicalSpecialist.validateColor (color)) {
            this.color = color;
        } else {
            this.color = CarColor.WHITE;
        }
    }

    public void setMileage (int mileage) {

        if (TechnicalSpecialist.validateMileage (mileage)) {
            this.mileage = mileage;
        } else {
            this.mileage = 0;
        }
    }

    public void setManufactureYear (int manufactureYear) {

        if (TechnicalSpecialist.validateManufactureYear (manufactureYear)) {
            this.manufactureYear = manufactureYear;
        } else {
            manufactureYear = 0;
        }

    }

}
