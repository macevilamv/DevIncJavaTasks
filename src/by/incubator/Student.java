package by.incubator;

public class Student {

    static int studentsCounter = 0;
    final String lastName;
    final String firstName;
    final double averageGrade;

    public Student(String lastName, String firstName, double averageGrade) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.averageGrade = averageGrade;
        studentsCounter += 1;
        System.out.println("Constructor with parameters is executed - " + studentsCounter);

    }

    @Override
    public String toString() {
        return  lastName + " "
                + firstName + ", "
                + averageGrade;
    }
}
