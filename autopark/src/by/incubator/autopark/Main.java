package by.incubator.autopark;

public class Main {
    public static void main(String[] args) {

        VehicleType [] vehicleTypes = {new VehicleType("Bus", 1.2d),
                new VehicleType("Car", 1d), 
                new VehicleType("Rink", 1.5d),
                new VehicleType("Tractor", 1.2d)};

        double max = vehicleTypes[0].getTaxCoefficient();
        double sum = 0;
        double average = 0;

        for (int i = 0; i < vehicleTypes.length; i++) {
            vehicleTypes[i].display();

            if (max < vehicleTypes[i].getTaxCoefficient()) {
                max = vehicleTypes[i].getTaxCoefficient();
            }

            if (i == vehicleTypes.length-1) {
                vehicleTypes[i].setTaxCoefficient(vehicleTypes[i].getTaxCoefficient() + 1.3d);
            }

            sum += vehicleTypes[i].getTaxCoefficient();

            if (i == vehicleTypes.length-1) {
                average = sum / vehicleTypes.length;
            }

        }

        System.out.println(average);
        System.out.println(max);
    }
}
