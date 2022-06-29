package by.incubator.task7;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryList {
    public static void main(String[] args) {
        List <Object> list = new ArrayList<>();

        while (true) {
            list.add(new Object());
        }
    }
}
