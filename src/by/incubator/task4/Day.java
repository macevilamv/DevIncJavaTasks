package by.incubator.task4;

enum Day {
    MONDAY("MON",false), TUESDAY("TUE",false),
    WEDNESDAY("WED",false),    THURSDAY("THU",false),
    FRIDAY ("FRI", false), SATURDAY ("SAT", true),
    SUNDAY ("SUN", true), EXCEPTION("EXC", false);

    private final String SHORT_NAME;
    private final String MESSAGE;
    private final boolean isWeekend;

    Day (String short_name, boolean isWeekend) {
        this.SHORT_NAME = short_name;
        this.isWeekend = isWeekend;
        this.MESSAGE = isWeekend ? "IS A WEEKEND" : "IS NOT A WEEKEND";
    }

    public static void showInfo (int dayNumber) {
        Day day = getDay(dayNumber);
        System.out.println (day.name() + ", " + day.SHORT_NAME + ", " + day.MESSAGE);
    }

    private static Day getDay (int dayNumber) {
        if (dayNumber < 0 || dayNumber > 6) {
            System.out.println("There is no such day");
            return Day.values()[7];
        }

        return Day.values()[dayNumber];
    }
}