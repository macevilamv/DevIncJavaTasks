package by.incubator.task9;

public interface Starveable {
    default void isHungry() {
        System.out.println("not hungry");
    }
}
