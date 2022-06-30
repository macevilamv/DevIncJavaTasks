package by.incubator.task7;

public class Main {
    public static void main(String[] args) {
        try {
            StackOverFlowErrorRecursion.generateOverflow();
        } catch (StackOverflowError error) {
            System.out.println("StackOverFlow error with recursion");
        }

        try {
            StackOverflowConstructor.generateOverflow();
        } catch (StackOverflowError error) {
            System.out.println("StackOverFlow error with constructor");
        }

        try {
            OutOfMemoryErrorArray.generateError();
        } catch (OutOfMemoryError error) {
            System.out.println("OutOfMemoryError with array");
        }

        try {
            OuOfMemoryLoop.generateOutOfMemoryLoop();
        } catch (OutOfMemoryError error) {
            System.out.println("OutOfMemoryError with loop");
        }

        try {
            OutOfMemoryList.outOfMemoryList();
        } catch (OutOfMemoryError error) {
            System.out.println("OutOfMemoryError with list");
        }
    }
}
