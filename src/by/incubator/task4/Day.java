package by.incubator.task4;

enum Day {
    MONDAY("MON",false), TUESDAY("TUE",false),
    WEDNESDAY("WED",false),    THURSDAY("THU",false),
    FRIDAY ("FRI", false), SATURDAY ("SAT", true),
    SUNDAY ("SUN", true);

    public static void showDay (int i) {

        switch (i) {
            case 1 :
                System.out.println(MONDAY + " (" + MONDAY.SHORT_NAME + ") " + MONDAY.MESSAGE);
                break;
            case 2 :
                System.out.println(TUESDAY + " (" + TUESDAY.SHORT_NAME + ") " + TUESDAY.MESSAGE);
                break;
            case 3 :
                System.out.println(WEDNESDAY + " (" + WEDNESDAY.SHORT_NAME + ") " + WEDNESDAY.MESSAGE);
                break;
            case 4 :
                System.out.println(THURSDAY + " (" + THURSDAY.SHORT_NAME + ") " + THURSDAY.MESSAGE);
                break;
            case 5 :
                System.out.println(FRIDAY + " (" + FRIDAY.SHORT_NAME + ") " + FRIDAY.MESSAGE);
                break;
            case 6 :
                System.out.println(SATURDAY + " (" + SATURDAY.SHORT_NAME + ") " + SATURDAY.MESSAGE);
                break;
            case 7 :
                System.out.println(SUNDAY + " (" + SUNDAY.SHORT_NAME + ") " + SUNDAY.MESSAGE);
                break;
            default:
                System.out.println("Incorrect data");
        }

    }

    private final String SHORT_NAME;
    private final String MESSAGE;
    private final boolean isWeekend;

    Day (String short_name, boolean isWeekend) {
        this.SHORT_NAME = short_name;
        this.isWeekend = isWeekend;

        if (isWeekend) {
            MESSAGE = "IS WEEKEND";
        } else {
            MESSAGE = "IS NOT A WEEKEND";
        }

    }

}