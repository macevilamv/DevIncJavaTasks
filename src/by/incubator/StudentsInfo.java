package by.incubator;

import java.util.Scanner;

public class StudentsInfo {

    public static void showInfo () {
      double averageScore = 0.0d;
      Student [] students = fillArray (createArray());

      averageScore = countAverage (students);
      System.out.println ("Average score is: " + averageScore);

      showStudentsBelowAvGrade (students, averageScore);
    }

    private static void showStudentsBelowAvGrade (Student [] students, double averageGrade) {
        System.out.println ("Students with grade below average: ");

        for (int i = 0; i < students.length; i++) {

            if (students[i].averageGrade < averageGrade) {
                System.out.println (students[i]);
            }

        }

    }

    private static double countAverage (Student [] students) {

        double sum = 0;
        double globalAverage = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].averageGrade;
        }
        globalAverage = sum / (double) Student.studentsCounter;

        return globalAverage;
    }

    private static Student [] fillArray (Student [] students) {

        Scanner in = new Scanner (System.in);
        String lastName;
        String firstName;
        double averageGrade;

        for (int i = 0; i < students.length; i++) {

            System.out.print ("Enter student last name: ");
            lastName = in.nextLine();
            System.out.print ("Enter student first name: ");
            firstName = in.nextLine();
            System.out.print ("Enter student average grade: ");
            averageGrade = Double.parseDouble (in.nextLine());
            students[i] = new Student (lastName, firstName, averageGrade);

        }

        return students;
    }

    private static Student [] createArray () {
        int LENGTH = 0;
        Student [] students;
        Scanner in = new Scanner (System.in);

        System.out.print("Enter number of students: ");

        LENGTH = Integer.parseInt (in.nextLine());

        if (LENGTH < 0 || LENGTH >= Integer.MAX_VALUE - 1) {
            System.out.println("Number of students can't be < 1 and > 2147483646");
            return new Student[0];
        }

        students = new Student[LENGTH];
        return students;
    }
}
