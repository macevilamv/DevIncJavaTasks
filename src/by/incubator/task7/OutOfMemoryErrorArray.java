package by.incubator.task7;

public class OutOfMemoryErrorArray {

    OutOfMemoryErrorArray() {
        int [] garbage = new int [Integer.MAX_VALUE];
    }

    public static void main(String[] args) {
        OutOfMemoryErrorArray t = new OutOfMemoryErrorArray();
    }

}
