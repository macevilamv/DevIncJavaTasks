package by.incubator.task11;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] people = initArray();

        Arrays.sort(people, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person)o1).getName().compareTo(((Person)o2).getName());
            }
        });
        System.out.println(Arrays.toString(people));
    }

    private static Person[] initArray () {
        return new Person[] {
                new Person("Ivan", 25),
                new Person("Dmitriy", 34),
                new Person("Vladislav", 53),
                new Person("Vladimir", 21),
                new Person("Oleg", 27),
                new Person("Evgeniy", 28)
        };
    }
}
