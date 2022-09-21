package by.incubator.task18;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException, NoSuchFieldException {
        Apple apple = ObjectFactory.create(Apple.class);
        Initializer initializer = new Initializer();
        BadInitializer badInitializer = new BadInitializer();

        initializer.initialize(apple,"weight", 100d);
        initializer.initialize(apple,"color", "red");
        System.out.println(apple);
        badInitializer.initialize(apple, "color", "BROKEN_ENCAPSULATION");
        System.out.println(apple);
    }
}
