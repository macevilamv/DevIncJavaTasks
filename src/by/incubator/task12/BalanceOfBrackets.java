package by.incubator.task12;

import java.util.*;

public class BalanceOfBrackets {
    public static boolean validateBrackets(String string) {
        ArrayDeque<Character> characters = new ArrayDeque<>();
        for (char ch : string.toCharArray()) {
            if (isLeftBracket(ch)) {
                characters.addFirst(ch);
            } else if (isRightBracket(ch)){
                if (areAntagonists(characters.peekFirst(), ch)) {
                    characters.pollFirst();
                } else {
                    return false;
                };
            }
        }
        return characters.isEmpty();
    }

    private static boolean isRightBracket(char c) {
        return c == '}' || c == ')' || c == ']' || c == '>';
    }

    private static boolean isLeftBracket(char c) {
        return c == '{' || c == '(' || c == '[' || c == '<';
    }

    private static boolean areAntagonists(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        } else if (left == '{' && right == '}') {
            return true;
        } else if (left == '<' && right == '>') {
            return true;
        } else if (left == '[' && right == ']') {
            return true;
        } else return false;

    }
}
