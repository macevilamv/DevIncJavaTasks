package by.incubator.task7;

public class OuOfMemoryLoop {
    public static void generateOutOfMemoryLoop() {
        Object [] objects = new Object[1231452355];

        for (int i = 0; ; i++) {
            objects[i] = new Object();
        }
    }
}
