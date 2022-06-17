package by.incubator.task3;

import java.util.Arrays;
import java.util.Scanner;

public class testTextProcessor {

    public static void processText () {

        Scanner in = new Scanner(System.in);
        String string = "Hello, user! How are you?";

        System.out.println("\"Hello, user! How are you?\" append \"Fine!\":");
        System.out.println(TextProcessor.appendToEnd(string,"Fine!"));
        System.out.println();

        System.out.println("\"Hello, user! How are you?\" insert \"dear\":");
        System.out.println(TextProcessor.insert(string,"dear", 6));
        System.out.println();

        System.out.println("\"Hello, user! How are you?\" remove \"!\":");
        System.out.println(TextProcessor.remove(string,'!'));
        System.out.println();

        System.out.println("\"Hello, user! How are you?\" replace \"user\" insert \"programmer\":");
        System.out.println(TextProcessor.replace(string, 7, 11, "programmer"));
        System.out.println();

        System.out.println("\"Hello, user! How are you?\" replace \"user\" insert \"programmer\":");
        System.out.println(TextProcessor.replace(string, 7, 11, "programmer"));
        System.out.println();

        System.out.println("\"Hello world!\" reverse: ");
        string = "Hello world!";
        System.out.println(TextProcessor.reverse(string));
        System.out.println();

        System.out.println("\"Dear programmer!\" reverse: ");
        string = "Dear programmer!";
        System.out.println(TextProcessor.reverse(string));
        System.out.println();

        System.out.println("\"How are you?\" reverse: ");
        string = "How are you?";
        System.out.println(TextProcessor.reverse(string));
        System.out.println();

        System.out.println("\"It's an easy task for you?\" reverse: ");
        string = "It's an easy task for you?";
        System.out.println(TextProcessor.reverse(string));
        System.out.println();


        System.out.print("Enter a line you want to remove spaces from: ");
        System.out.println(TextProcessor.trimSpaces());
        System.out.println();

        System.out.println("\"hhhHHHh yyYYYy OOooOO\" output uppercase characters: ");
        string = "hhhHHHh yyYYYy OOooOO";
        System.out.println(TextProcessor.outUpperCase(string));
        System.out.println();

        System.out.println("\"ahahahahah\" output even characters in uppercase : ");
        string = "ahahahahah";
        System.out.println(TextProcessor.evensToUpperCase(string));
        System.out.println();

        System.out.println(Arrays.toString(TextProcessor.processArray()));

    }

    public static void main(String[] args) {
        processText();
    }
}
