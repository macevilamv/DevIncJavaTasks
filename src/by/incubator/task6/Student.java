package by.incubator.task6;

public class Student {
    private static int studentsCounter = 0;
    private final String lastName;
    private final String firstName;
    private final double averageGrade;

    public Student(String lastName, String firstName, double averageGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.averageGrade = averageGrade;
        studentsCounter++;
        System.out.println("Constructor with parameters is executed - " + studentsCounter);
    }

    public static int getStudentsCounter() {
        return studentsCounter;
    }

    public static void setStudentsCounter(int studentsCounter) {
        Student.studentsCounter = studentsCounter;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return lastName + " "
                + firstName + ", "
                + averageGrade;
    }
}
