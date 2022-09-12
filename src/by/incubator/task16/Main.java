package by.incubator.task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> aList = initializeList();
        List<People> peopleList = createPeopleList();

        System.out.println(sortByAge(peopleList));
    }

    private static List<String> initializeList() {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a1");

        return list;
    }

    private static List<People> createPeopleList() {
        return Arrays.asList(new People("Basil", 16, Sex.MEN),
                new People("Peter", 23, Sex.MEN),
                new People("Helen", 42, Sex.WOMEN),
                new People("Ivan", 69, Sex.MEN));
    }

    private static long count(List<String> list, String obj) {
        return list
                .stream()
                .filter(string -> string.equals(obj))
                .count();
    }

    private static String returnFirst(List<String> list) {
        return list
                .stream()
                .findFirst()
                .orElse("0");
    }

    private static String returnThird(List<String> list) {
        return list
                .stream()
                .skip(2)
                .findFirst()
                .orElse("0");
    }

    private static void displayTwoSkippedFirst(List<String> list) {
        list.stream()
             .skip(1)
             .limit(2)
             .forEach(System.out::println);
    }

    private static void displayElementsByTemplate(List<String> list, String template) {
        List<String> selected = list.stream()
                                .filter(el -> el.equals(template))
                                .collect(Collectors.toList());

        System.out.println(selected);
    }

    private static boolean isAtLeastOnePresent(List<String> list, String obj) {
        return list
                .stream()
                .anyMatch(obj::equals);
    }

    private static boolean isPresent(List<String> list, String obj) {
        return list
                .stream()
                .noneMatch(obj::equals);
    }

    private static Integer[] getIntegers(List<String> list) {
        return list
                .stream()
                .map(el -> Integer.parseInt(el.substring(1)))
                .toArray(Integer[]::new);
    }

    private static String mergeElements(List<String> list) {
        return list
                .stream()
                .reduce((accumulator, string) -> accumulator + string)
                .orElse("0");
    }

    private static List<String> sortAlphabetically(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    private static void findRecruits(List<People> people) {
        people.stream()
                .filter(person -> (person.getAge() < 27 && person.getAge() > 18) && person.getSex().equals(Sex.MEN))
                .forEach(System.out::println);
    }

    private static Double findAverageAge(List<People> people) {
        return people.stream()
                .filter(person -> person.getSex().equals(Sex.MEN))
                .mapToDouble(People::getAge)
                .average()
                .getAsDouble();
    }

    private static long findNumberOfBodyAblePeople(List<People> people) {
        return people
                .stream()
                .filter(person ->
                            person.getSex().equals(Sex.MEN) ? person.getAge() >= 18 && person.getAge() < 60
                                                            : person.getAge() >= 18 && person.getAge() < 55)
                .count();
    }

    private static People findTheYoungest(List<People> people) {
        return people
               .stream()
               .min(Comparator.comparingDouble(People::getAge)).get();
    }

    private static List<People> sortByGender(List<People> peopleList) {
        return peopleList
                .stream()
                .sorted(Comparator.comparing(People::getSex))
                .collect(Collectors.toList());
    }

    private static List<People> sortByAge(List<People> peopleList) {
        return peopleList
                .stream()
                .sorted(Comparator.comparingDouble(People::getAge))
                .collect(Collectors.toList());
    }
}
