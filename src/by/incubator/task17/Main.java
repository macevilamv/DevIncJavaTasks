package by.incubator.task17;

import java.lang.reflect.InvocationTargetException;

public class Main  {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CodeAnalyzer.analyzeClass(new AnalyzedClassExample("info", 44444));
    }
}
