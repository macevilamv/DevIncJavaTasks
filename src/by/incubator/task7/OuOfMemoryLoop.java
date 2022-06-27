package by.incubator.task7;

public class OuOfMemoryLoop {

    Object [] objects = new Object[1231452355];

    public static void main(String[] args) {

        OuOfMemoryLoop o = new OuOfMemoryLoop();

        for (int i = 0; ; i++) {
            o.objects[i] = new Object();
        }

    }
}
