package by.incubator.task12;

import java.util.*;

public class BalanceOfBrackets {
    public static boolean validateBrackets(String string) {
        ArrayDeque<Character> characters = new ArrayDeque<>();
        for (char ch : string.toCharArray()) {
            if (isRightBracket(ch)) {
                characters.addLast(ch);
            } else if (isLeftBracket(ch)) {
                characters.addFirst(ch);
            }

            if (areAntagonists(characters.peekFirst(), characters.peekLast())) {
                characters.pollLast();
                characters.pollFirst();
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
        if (left == '(' & right == ')') {
            return true;
        } else if (left == '{' & right == '}') {
            return true;
        } else if (left == '<' & right == '>') {
            return true;
        } else if (left == '[' & right == ']') {
            return true;
        } else return false;

    }
}
