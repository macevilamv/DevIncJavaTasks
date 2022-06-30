package by.incubator;

import java.util.Scanner;

public class StudentsInfo {
    public static void showInfo() {
        double averageScore = 0.0d;
        Student[] students = fillArray(createArray());

        averageScore = countAverage(students);
        System.out.println("Average score is: " + averageScore);

        showStudentsBelowAvGrade(students, averageScore);
    }

    private static void showStudentsBelowAvGrade(Student[] students, double averageGrade) {
        System.out.println("Students with grade below average: ");

        for (int i = 0; i < students.length; i++) {

            if (students[i].getAverageGrade() < averageGrade) {
                System.out.println(students[i]);
            }
        }
    }

    private static double countAverage(Student[] students) {
        double sum = 0.0d;
        double globalAverage = 0.0d;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverageGrade();
        }
        globalAverage = sum / (double) Student.getStudentsCounter();

        return globalAverage;
    }

    private static Student[] fillArray(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            students[i] = createStudent();
        }
        return students;
    }

    private static Student createStudent () {
        Scanner in = new Scanner(System.in);
        String lastName;
        String firstName;
        double averageGrade;

        System.out.print("Enter student last name: ");
        lastName = in.nextLine();
        System.out.print("Enter student first name: ");
        firstName = in.nextLine();
        System.out.print("Enter student average grade: ");
        averageGrade = Double.parseDouble(in.nextLine());

        return new Student(lastName, firstName, averageGrade);
    }

    private static Student[] createArray() {
        Student[] students;
        if (readInt() < 0) {
            System.out.println("Number of students can't be < 1");
            return new Student[0];
        }
        students = new Student[readInt()];
        return students;
    }

    private static int readInt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        return Integer.parseInt(in.nextLine());
    }
}
