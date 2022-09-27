package by.incubator.task17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class CodeAnalyzer {
    public static void analyzeClass(Object obj) throws InvocationTargetException, IllegalAccessException {
        Class classAnalyzed = obj.getClass();
        showClassName(classAnalyzed);
        showClassLoader(classAnalyzed);
        showInterfaces(classAnalyzed);
        showParents(classAnalyzed);
        showDeclaredFields(classAnalyzed);
        showConstructors(classAnalyzed);
        showMethods(classAnalyzed);
        showAnnotations(classAnalyzed);
    }

    private static void showClassName(Class classAnalyzed) {
        System.out.println("ClassName: " + classAnalyzed.getClass().getName());
        System.out.println("-------------------------------------------------");
    }

    private static void showInterfaces(Class classAnalyzed) {
        Class[] interfaces = classAnalyzed.getInterfaces();

        System.out.println("Interfaces: ");
        Arrays.stream(interfaces).forEach(element ->
                System.out.println("   " + element + " methods: " + Arrays.toString(element.getDeclaredMethods())));

        System.out.println("-------------------------------------------------");
    }

    private static void showParents(Class classAnalyzed) {
        Class pointer = classAnalyzed.getSuperclass();

        System.out.println("Inheritance hierarchy: ");

        while (pointer != null) {
            System.out.println("    " + pointer);
            pointer = pointer.getSuperclass();
        }
        System.out.println("-------------------------------------------------");
    }

    private static void showMethods(Class classAnalyzed) {
        System.out.println("Methods: ");
        Arrays.stream(classAnalyzed.getDeclaredMethods())
                .forEach(element ->
                        System.out.println("   " + element + " annotations: " + Arrays.toString(element.getAnnotations())));
        System.out.println("-------------------------------------------------");
    }

    private static void showClassLoader(Class classAnalyzed) {
        ClassLoader analyzedClassLoader = classAnalyzed.getClassLoader();

        System.out.println("ClassLoader: " + analyzedClassLoader);
        System.out.println("-------------------------------------------------");
    }

    private static void showConstructors(Class classAnalyzed) {
        Constructor[] constructors = classAnalyzed.getDeclaredConstructors();

        System.out.println("Constructors: ");
        Arrays.stream(constructors).forEach(element ->
                System.out.println("   " + element + " annotations: " + Arrays.toString(element.getAnnotations())));
        System.out.println("-------------------------------------------------");
    }

    private static void showDeclaredFields(Class classAnalyzed) {
        Field[] declaredFields = classAnalyzed.getDeclaredFields();

        System.out.println("Declared Fields: ");
        Arrays.stream(declaredFields).forEach(element ->
                System.out.println("   " + element + " annotations: " + Arrays.toString(element.getAnnotations())));
        System.out.println("-------------------------------------------------");
    }

    private static void showAnnotations(Class classAnalyzed) {
        System.out.println("Annotations: ");
        Arrays.stream(classAnalyzed.getAnnotations()).forEach(element ->
                System.out.println("   " + element));
        System.out.println("-------------------------------------------------");
    }
}
