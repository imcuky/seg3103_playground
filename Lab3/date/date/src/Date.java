public class Date {

    // Data fields
    private int year;
    private int month;
    private int day;

    // String array for displaying month names
    private static final String[] MONTH_NAMES = {
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };

    // Constructor
    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    /**
     * Sets the day and validates it.
     */
    private void setDay(int day) {
        if (day < 1) {
            throw new IllegalArgumentException("Day must be greater or equal to 1.");
        }
        if (day > 31) {
            throw new IllegalArgumentException("Day must be less or equal to 31.");
        }
        if (isThirtyDayMonth() && day > 30) {
            throw new IllegalArgumentException("Day must be less than or equal to 30 for " + MONTH_NAMES[month - 1]);
        }
        if (month == 2) {
            if (isLeapYear() && day > 29) {
                throw new IllegalArgumentException("Day must be less than or equal to 29 for " + MONTH_NAMES[month - 1] + " in a leap year.");
            } else if (!isLeapYear() && day > 28) {
                throw new IllegalArgumentException("Day must be less than or equal to 28 for " + MONTH_NAMES[month - 1] + " in a non-leap year.");
            }
        }
        this.day = day;
    }

    /**
     * Sets the month and validates it.
     */
    private void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        this.month = month;
    }

    /**
     * Sets the year and validates it.
     */
    private void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year must be greater or equal to 0.");
        }
        this.year = year;
    }

    /**
     * Returns the date of the next day.
     */
    public Date nextDate() {
        int nextYear = year, nextMonth = month, nextDay = day + 1;
        if (isEndOfMonth()) {
            nextDay = 1;
            if (month == 12) {
                nextYear++;
                nextMonth = 1;
            } else {
                nextMonth++;
            }
        }
        return new Date(nextYear, nextMonth, nextDay);
    }

    /**
     * Checks if the date is the end of the month.
     */
    private boolean isEndOfMonth() {
        if (day == 31) return true;
        if (day == 30 && isThirtyDayMonth()) return true;
        if (month == 2 && ((day == 29 && isLeapYear()) || (day == 28 && !isLeapYear()))) return true;
        return false;
    }

    /**
     * Checks if the month has 30 days.
     */
    private boolean isThirtyDayMonth() {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    /**
     * Checks if the year is a leap year.
     */
    public boolean isLeapYear() {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

    /**
     * Returns the string representation of the date.
     */
    @Override
    public String toString() {
        return year + "/" + MONTH_NAMES[month - 1] + "/" + day;
    }

    /**
     * Checks if this date is equal to another date.
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Date)) return false;
        Date otherDate = (Date) obj;
        return year == otherDate.getYear() && month == otherDate.getMonth() && day == otherDate.getDay();
    }
}
