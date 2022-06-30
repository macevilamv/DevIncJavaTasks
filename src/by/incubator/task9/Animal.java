package by.incubator.task9;

public abstract class Animal implements Moveable, Voiceable, Starveable {
    String name;
    int footNumber;
    boolean hasMustache;

    Animal () {}

    public Animal(String name, int footNumber, boolean hasMustache) {
        setName(name);
        setFootNumber(footNumber);
        setHasMustache(hasMustache);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = correctValue(name);
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        this.footNumber = correctValue(footNumber);
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }

    private static int correctValue (int foots) {
        return (foots < 0)? 0 : foots;
    }

    private static String correctValue(String name) {
        return ((name == null || name.isEmpty())) ? "default" : name;
    }
}
