package by.incubator.task11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] people = initArray();

        Arrays.sort(people, new PersonNameComparator(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
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
