package by.incubator.task15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambdas {
   public static <T> T[] filter(T[] array, Filter<T> filter) {
       for (int i = 0; i < array.length; i++) {
           if (!filter.apply(array[i])) {
               array[i] = null;
           }
       }
       return array;
   }

   public static <T> Integer[] fill (Integer[] arrToFill, Function<Integer,Integer> function) {
       return Arrays.stream(arrToFill).map(function).toArray(Integer[]::new);
   }

   public static void outPutRandomName(List<String> names, Supplier<Integer> integerSupplier) {
       System.out.println(names.get(integerSupplier.get()));
   }
}
