package by.incubator.task9;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Main {
    public static void main(String[] args) {
        Animal[] herd = createArray();
        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 6, true);

        makeVoice(herd);
        makeMove(herd);
        makeHungry(herd);
        execute(horse);
        execute(kangaroo);
        execute(dragonfly);
    }

    private static Animal[] createArray () {
        return new Animal[] {
                new Horse("Horse 1", 4, false),
                new Horse("Horse 2", 4, false),
                new Kangaroo("Kangaroo 1", 4, true),
                new Kangaroo("Kangaroo 2", 4, true),
                new Dragonfly("Dragonfly 1", 6, true),
                new Dragonfly("Dragonfly 2", 6, true),
                new Animal("Unknown type", 10, true) {}
        };
    }

    private static void execute (Animal animal) {
       animal.voice();
       animal.move();
       animal.isHungry();
    }

    private static void makeVoice (Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();
        }
    }

    private static void makeMove (Animal[] animals) {
        for (Animal animal : animals) {
            animal.move();
        }
    }

    private static void makeHungry (Animal[] animals) {
        for (Animal animal : animals) {
            animal.isHungry();
        }
    }
}
