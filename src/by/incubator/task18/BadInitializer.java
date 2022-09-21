package by.incubator.task18;

import java.lang.reflect.Field;

public class BadInitializer extends Initializer {
    @Override
    public <T> T initialize(T target, String fieldName, Object value) {
        try {
            Field field = target.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(target, value);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    return (T) value;
    }
}
