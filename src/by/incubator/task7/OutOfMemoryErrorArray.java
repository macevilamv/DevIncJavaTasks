package by.incubator.task7;

public class OutOfMemoryErrorArray {
   public static void generateError() {
       int [] garbage = new int [Integer.MAX_VALUE];
   }
}
