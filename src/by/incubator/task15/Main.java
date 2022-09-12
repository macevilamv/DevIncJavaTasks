package by.incubator.task15;

import by.incubator.task11.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Person[] people = initArray();
        Person[] filtered = new Person[people.length];
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 16, 32, 64, 128, 256};
        Integer[] squares = new Integer[integers.length];
        List<String> list = createList();
        Predicate<Integer> findEvenParity = (element) -> element % 2 == 0;
        Predicate<Integer> findOddParity = (element) -> element % 2 != 0;
        Supplier<Integer> randomNumSupplier = () -> {
            return (int)(Math.random() * list.size());
        };
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        UnaryOperator<Integer> integerUnaryOperator = (element) -> element * element;
        Consumer<String> printGreetings = s -> System.out.println("hello " + s);
        Converter<Dog, Cat> dogCatConverter = dog -> new Cat(dog.name, dog.age, dog.weight);
        Dog dog = new Dog("Dog1", 1500, 1230);
        Cat cat = dogCatConverter.convert(dog);

        squares =  Lambdas.fill(integers, (element) -> element * element);
        Arrays.stream(squares).forEach(System.out::println);
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(Arrays.toString(people));
        filtered = Lambdas.filter(people, (element) -> element.getAge() > 27);
        System.out.println(Arrays.toString(filtered));;
        System.out.println(cat.name + ", " + cat.age + ", "  + cat.weight);
        Arrays.stream(integers).filter(findEvenParity).forEach(System.out::println);
        Arrays.stream(integers).filter(findOddParity).forEach(System.out::println);
        printGreetings.accept("world");
        Lambdas.outPutRandomName(list,randomNumSupplier);
        System.out.println(stringIntegerFunction.apply("1123") - 10);
        System.out.println(integerUnaryOperator.apply(8));
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

    private static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("Elena");
        list.add("Alex");
        list.add("Jim");
        list.add("John");
        list.add("Sara");

        return list;
    }
}
