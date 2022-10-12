package by.incubator.task20;

public class MySingleton {
    int a;
    int b;
    int c;
    private static MySingleton singleton;

    private MySingleton() {
        a = 1;
        b = 2;
        c = 3;
    }

    public static synchronized MySingleton instance() {
        if (singleton == null) {
            singleton = new MySingleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "a = " + a + ", " + "b = " + b + ", " + "c = " + c + ", " + "hash = " + hashCode();
    }
}
