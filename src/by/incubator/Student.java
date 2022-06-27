package by.incubator;

public class Student {

    static int studentsCounter = 0;
    private final String lastName;
    private final String firstName;
    final double averageGrade;

    public Student (String lastName, String firstName, double averageGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.averageGrade = averageGrade;
        studentsCounter++;
        System.out.println ("Constructor with parameters is executed - " + studentsCounter);
    }

    @Override
    public String toString() {
        return  lastName + " "
                + firstName + ", "
                + averageGrade;
    }
}
