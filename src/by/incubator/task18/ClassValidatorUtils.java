package by.incubator.task18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ClassValidatorUtils {
    public static boolean validateClass(Class<?> validatedClass) {
        List<Field> fields = Arrays.stream(validatedClass.getDeclaredFields())
                                   .collect(Collectors.toList());

        return validateDefaultConstructor(validatedClass) &
                validateGetters(fields, validatedClass) & validateSetters(fields, validatedClass);
    }

    private static boolean validateDefaultConstructor(Class<?> validatedClass) {
        try {
            Constructor<?> constructor = validatedClass.getConstructor();

            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public static String generateGetterName(Field field) {
        return "get" + field.getName()
                .substring(0, 1).toUpperCase(Locale.ROOT)
                + field.getName().substring(1);
    }

   public static String generateSetterName(Field field) {
        return "set" + field.getName()
                .substring(0, 1).toUpperCase(Locale.ROOT)
                + field.getName().substring(1);
    }

    private static boolean validateGetters(List<Field> fields, Class validatedClass) {
            try {
                for (Field field : fields) {
                    if (Modifier.isFinal(field.getModifiers())) {
                        try {
                            Method getter = validatedClass.getMethod(generateGetterName(field));
                            return false;
                        } catch (NoSuchMethodException e) {
                            return true;
                        }
                    }
                    Method getter = validatedClass.getMethod(generateGetterName(field));
                }
            } catch (NoSuchMethodException e) {
                return false;
            }
            return true;
    }

    private static boolean validateSetters(List<Field> fields, Class<?> validatedClass) {
        try {
            for (Field field : fields) {
                if (Modifier.isFinal(field.getModifiers())) {
                    try {
                        Method setter = validatedClass.getDeclaredMethod(generateSetterName(field), field.getType());
                        return false;
                    } catch (NoSuchMethodException e) {
                        return true;
                    }
                }
                Method setter = validatedClass.getDeclaredMethod(generateSetterName(field), field.getType());
            }
        } catch (NoSuchMethodException e) {
            return false;
        }
        return true;
    }
}
