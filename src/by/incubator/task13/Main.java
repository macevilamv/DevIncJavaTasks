package by.incubator.task13;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> mal = new MyArrayList<>();
        System.out.println(FromJoseph.findSurvivor(mal, 41, 1));

        MyLinkedList<String> mll = new MyLinkedList<>();
        System.out.println(FromJoseph.findSurvivor(mll, 41, 1));
    }
}
