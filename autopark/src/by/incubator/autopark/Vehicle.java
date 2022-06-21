package by.incubator.autopark;

import java.util.Objects;

public class Vehicle implements Comparable <Vehicle>{

    private VehicleType type;
    private CarColor color;
    private String model;
    private String stateNumber;
    private double mass;
    private double mileage;
    private int yearOfIssue;

    public Vehicle() {}

    public Vehicle (VehicleType type, CarColor color, String model, String stateNumber, double mass,
                    double mileage, int yearOfIssue) {

        this.type = type;
        this.color = color;
        this.model = model;
        this.stateNumber = stateNumber;
        this.mass = mass;
        this.mileage = mileage;
        this.yearOfIssue = yearOfIssue;
    }

    public double getCalcTaxPerMonth () {
        return (this.mass * 0.0013) + (type.getTaxCoefficient()*30) + 5;
    }

    @Override
    public String toString() {
        return type.getTypeName() + ", "
                + model + ", "
                + color + ", "
                + stateNumber + ", "
                + mass + ", "
                + mileage + ", "
                + yearOfIssue + ", "
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
        Vehicle secondVehicle = (Vehicle) obj;

        if (this.yearOfIssue == secondVehicle.yearOfIssue) {

            if (this.mileage == secondVehicle.mileage) {
                return 0;
            } else if (this.mileage > secondVehicle.mileage) {
                return 1;
            } else {
                return -1;
            }

        } else if (this.yearOfIssue > secondVehicle.yearOfIssue) {
            return 1;
        } else {
            return -1;
        }
    }

    public VehicleType getType() {
        return type;
    }

    public void setType (VehicleType type) {
        this.type = type;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor (CarColor color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber (String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public double getMass() {
        return mass;
    }

    public void setMass (double mass) {
        this.mass = mass;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage (double mileage) {
        this.mileage = mileage;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue (int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
