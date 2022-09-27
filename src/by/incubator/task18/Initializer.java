package by.incubator.task18;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Initializer {
    public <T> T initialize(T target, String fieldName, Object value) {
        try {
            Field field = target.getClass().getDeclaredField(fieldName);
            Method setter = target.getClass()
                     .getDeclaredMethod(ClassValidatorUtils.generateSetterName(field),
                             field.getType());
            setter.invoke(target, value);
        } catch (NoSuchFieldException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    return (T) value;
    }
}
