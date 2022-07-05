package by.incubator.task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TextProcessor {

    public static String appendToEnd (String text, String appendix) {
        return text + " " + appendix;
    }

    public static String replace (String text, int from, int to, String replacer) {

        if (from < 0  || to < 0) {
            return text;
        }

        return text.substring(0, from) + replacer + text.substring (to, text.length());
    }

    public static String remove (String text, char ch) {
        return text.replaceAll (String.valueOf (ch), "");
    }

    public static String insert (String text, String appendix, int position) {

        if (position - 1 > text.length() || position < 0) {
            return text;
        }

        return text.substring(0,position) + appendix + text.substring(position, text.length());
    }

    public static String reverse (String text) {
        StringBuilder buffer = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            buffer.append (text.charAt (i));
        }

        return buffer.toString();
    }

    public static String trimSpaces () {

        String input = inputString();
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt (i) == '.') {
                break;
            } else if (input.charAt (i) != ' ') {
                buffer.append(input.charAt (i));
            }

        }

        return buffer.toString();
    }

    public static String outUpperCase (String text) {
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            if (Character.isUpperCase (text.charAt (i))) {
                buffer.append(text.charAt(i));
            }

        }

        return buffer.toString();
    }

    public static String evensToUpperCase (String text) {
        StringBuilder buffer = new StringBuilder();

        for (int i = 1; i < text.length(); i += 2) {

            if (i % 2 == 0) {
                buffer.append (text.charAt (i));
            }

        }

        return buffer.toString().toUpperCase(Locale.ROOT);
    }

    public static String [] processArray () {
        String [] arr = initArray (createStrArray());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = isEmptyString (arr[i]);
        }

        return arr;
    }

    private static String isEmptyString(String string) {
        return string.isEmpty() ? "String is empty" : string;
    }

    private static String [] initArray (String [] arr) {
        Scanner in = new Scanner (System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print ("Enter a string: ");
            arr[i] = in.nextLine();
        }

        return arr;
    }
    
    private static String [] createStrArray () {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter array length: ");
        final int LENGTH = Integer.parseInt (in.nextLine());
        
        return new String[LENGTH];
    }

    private static String inputString () {
        Scanner in = new Scanner (System.in);
        String input = in.nextLine();
        in.close();
        return input;
    }
}
