package by.incubator.task7;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryList {
  public static void outOfMemoryList() {
        List <Object> list = new ArrayList<>();

        while (true) {
            list.add(new Object());
        }
    }
}
