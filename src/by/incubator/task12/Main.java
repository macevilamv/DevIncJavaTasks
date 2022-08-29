package by.incubator.task12;

public class Main {
    public static void main(String[] args) {
        String TTESTC1 = "()";
        String TTESTC2 = "((()))";
        String TTESTC3 = "(({}))";
        String TTESTC4 = "((){}<>)";
        String TTESTC5 = "([(){}<>])";
        String TTESTC6 = "(()((())){})";
        String TTESTC7 = "((()()({})))";
        String FTESTC1 = "())";
        String FTESTC2 = "(((()))";
        String FTESTC3 = "(({()]))";
        String FTESTC4 = "(()}[])";
        String FTESTC5 = "(({)})";
        String FTESTC6 = "((((}}}}";
        String FTESTC7 = "({()}])[)]";

        System.out.println(BalanceOfBrackets.validateBrackets(TTESTC7));
    }
}
