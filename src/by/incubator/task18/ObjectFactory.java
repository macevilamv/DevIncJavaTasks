package by.incubator.task18;

import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {
    public static <T> T create (Class<T> tClass) throws NoSuchMethodException,
                                                        InvocationTargetException,
                                                        InstantiationException,
                                                        IllegalAccessException {
        if (ClassValidatorUtils.validateClass(tClass)) {
            return tClass.getConstructor().newInstance();
        } else {
            throw new InstantiationException("Error! Class is not suited to be used in the method.");
        }
    }
}
