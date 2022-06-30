package by.incubator.autopark;

public class Main {
    public static void main(String[] args) {
        VehicleType [] vehicleTypes = initArray();
        double max = vehicleTypes[0].getTaxCoefficient();
        double sum = 0.0d;
        double average = 0.0d;

        for (int i = 0; i < vehicleTypes.length; i++) {
            vehicleTypes[i].display();

            if (max < vehicleTypes[i].getTaxCoefficient()) {
                max = vehicleTypes[i].getTaxCoefficient();
            }

            sum += vehicleTypes[i].getTaxCoefficient();

            if (i == vehicleTypes.length-1) {
                average = sum / vehicleTypes.length;
            }
        }

        vehicleTypes[vehicleTypes.length-1]
                .setTaxCoefficient(vehicleTypes[vehicleTypes.length-1]
                .getTaxCoefficient() + 1.3d);

        System.out.println(average);
        System.out.println(max);
    }

    private static VehicleType[] initArray () {
         return new VehicleType[] {new VehicleType("Bus", 1.2d),
                new VehicleType("Car", 1d),
                new VehicleType("Rink", 1.5d),
                new VehicleType("Tractor", 1.2d)};
    }
}
