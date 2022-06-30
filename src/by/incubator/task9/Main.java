package by.incubator.task9;

public class Main {
    public static void main(String[] args) {
        Animal[] herd = createArray();
        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 6, true);

        execute(herd);
        execute(horse);
        execute(kangaroo);
        execute(dragonfly);
    }

    private static Animal[] createArray() {
        return new Animal[]{
                new Horse("Horse 1", 4, false),
                new Horse("Horse 2", 4, false),
                new Kangaroo("Kangaroo 1", 4, true),
                new Kangaroo("Kangaroo 2", 4, true),
                new Dragonfly("Dragonfly 1", 6, true),
                new Dragonfly("Dragonfly 2", 6, true),
                new Animal("Unknown type", 10, true) {
                }
        };
    }

    private static void execute(Animal ... animal) {
        for (Animal an : animal) {
            an.move();
            an.voice();
            an.isHungry();
        }
    }
}

