package Lesson09_Enum.Task1;

public enum Months {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    private int days;
    private Seasons season;

    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return this.days;
    }

    public Seasons getSeason() {
        return this.season;
    }

    /**
     * @param inMonth
     * @return
     */
    public static boolean monthExist(String inMonth) {
        for (Months month : Months.values()) {
            if (month.name().equals(inMonth)) {
                return true;
            }
        }

        return false;
    }
}
