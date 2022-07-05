package by.incubator.task7;

public class StackOverflowConstructor {
    StackOverflowConstructor constructor = new StackOverflowConstructor();

    public static void generateOverflow() {
        StackOverflowConstructor constructor = new StackOverflowConstructor();
    }
}
