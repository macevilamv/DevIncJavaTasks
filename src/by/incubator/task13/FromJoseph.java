package by.incubator.task13;

import java.util.List;

public class FromJoseph {

    public static String findSurvivor(List<String> list, int number, int step) {
       initWarriorsList(list, number);

       while (list.size() > 1) {
           for (int i = 0; i < list.size(); i += step) {
               if (i == list.size() - 1) {
                   list.remove(list.size() - i - 1);
               } else {
                   list.remove(i + 1);
               }
           }
       }
       return list.get(list.size() - 1);
    }

    private static void initWarriorsList(List<String> list, int number) {
        for (int i = 1; i <= number; i++) {
            list.add("Warrior_" + i);
        }
    }
}
