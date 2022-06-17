package by.incubator.task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TextProcessor {

    public static String appendToEnd (String text, String appendix) {
        return text + " " + appendix;
    }

    public static String insert (String text, String appendix, int position) {
        if (position - 1 > text.length() || position < 0) {
            return text;
        }
        return text.substring(0,position) + appendix + text.substring(position, text.length());
    }

    public static String reverse (String text) {
        StringBuilder buffer = new StringBuilder();

        for (int i = text.length() - 1; i >= 0 ; i--) {
            buffer.append(text.charAt(i));
        }

        return buffer.toString();
    }

    public static String trimSpaces () {
        Scanner in = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder();
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '.') {
                break;
            } else if (input.charAt(i) != ' ') {
                buffer.append(i);
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

        for (int i = 1; i < text.length(); i+=2) {

            if (i % 2 == 0) {
                buffer.append(text.charAt(i));
            }

        }

        return buffer.toString().toUpperCase(Locale.ROOT);
    }

    public static String [] processArray () {
        String [] arr = initArray(createStrArray());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = isEmptyString(arr[i]);
        }

        return arr;
    }

    private static String isEmptyString(String string) {
        return string.equals("") ? "String is empty" : string;
    }

    private static String [] initArray (String [] arr) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter a string: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }

        in.close();
        return arr;
    }
    
    private static String [] createStrArray () {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter array length: ");
        final int LENGTH = in.nextInt();
        in.close();
        
        return new String[LENGTH];
    }

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";

        System.out.println (str1.equals(str2));
        System.out.println (str1.equals(str3));
        System.out.println (str1.equals(str4));

        System.out.println (str2.equals(str3));
        System.out.println (str2.equals(str4));

        System.out.println (str3.equals(str4));

        System.out.println (str1.equalsIgnoreCase(str2));

        System.out.println (str1 == str4);

        str1 = "JavaJava";
        System.out.println (str1.substring(4) == str4);

        System.out.println(str1 == null);

        str1 = null;
        System.out.println(str1 == null);


    }
    
}
