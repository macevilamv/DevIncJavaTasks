package by.incubator.task14;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String [] products = new String[] {"Milk", "Bread", "Salad", "Broccoli", "Pears",
                             "Pineapples", "Buuter"};
        MyHashSet<String> myHashSet = new MyHashSet<>();
        myHashSet= getProductSet(myHashSet, products);

        putIntoHashMap(myHashMap, products);
        System.out.println(mostFrequent(myHashMap, products));

    }

    public static void putIntoHashMap(MyHashMap<String, Integer> myHashMap,String [] products) {
        for (int i = 0; i < products.length; i++) {
            myHashMap.put(products[i], (int) (Math.random() * (70 - 30) + 70));
        }
    }

    private static String mostFrequent(MyHashMap<String, Integer> myHashMap, String [] products) {
        int max = 0;
        String mostFrequentProduct = "";

        for (String product:
                products) {
            int quantity = myHashMap.get(product);

            if (quantity > max) {
                max = quantity;
                mostFrequentProduct = product;
            }
        }

        return mostFrequentProduct;
    }

    private static MyHashSet<String> getProductSet(MyHashSet<String> myHashSet, String [] products) {
        for (String product : products) {
            myHashSet.add(product);
        }

        myHashSet.add("Sweets");
        myHashSet.add("Chocolate");
        myHashSet.add("Cookies");
        myHashSet.add("Marmalade");

        return myHashSet;
    }
}
