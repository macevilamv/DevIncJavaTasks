package by.incubator.autopark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TechnicalSpecialist {

    public static final int LOWER_LIMIT_MANUFACTURE_YEAR = 1886;

    public static boolean validateManufactureYear (int year) {
        return year >= LOWER_LIMIT_MANUFACTURE_YEAR;
    }

    public static boolean validateMileage (int mileage) {
        return mileage >= 0;
    }

    public static boolean validateWeight (double weight) {
        return weight >= 0;
    }

    public static boolean validateColor (CarColor color) {
        return color != null;
    }

    public static boolean validateVehicleType (VehicleType type) {
        return !(type.getTypeName().equals("")) && type.getTypeName() != null &&
                type.getTaxCoefficient() >= 0;
    }

    public static boolean validateRegistrationNumber (String number) {

        if (number == null) {
            return false;
        }

        Pattern pattern = Pattern.compile("\\d{4}\\s[A-Z]{2}-\\d");
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateModelName (String name) {
        return !(name.equals(""));
    }

}
