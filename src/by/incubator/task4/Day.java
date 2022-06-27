package by.incubator.task4;

enum Day {

    MONDAY("MON",false), TUESDAY("TUE",false),
    WEDNESDAY("WED",false),    THURSDAY("THU",false),
    FRIDAY ("FRI", false), SATURDAY ("SAT", true),
    SUNDAY ("SUN", true);

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

    public static void showInfo (int i) {

        if (i < 1 || i > 7) {
            System.out.println("There is no such day");
            return;
        }

        showDay (getDay (i));
    }

    private static void showDay (Day day) {
        System.out.println (day.name() + ", " + day.SHORT_NAME + ", " + day.MESSAGE);
    }

    private static Day getDay (int dayNumber) {
        return Day.values()[dayNumber - 1];
    }

}