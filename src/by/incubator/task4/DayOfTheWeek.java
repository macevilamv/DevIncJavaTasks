package by.incubator.task4;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        Day.showInfo(Integer.parseInt(scanner.nextLine()) - 1);
        scanner.close();
    }
}
