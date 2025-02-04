package ca.bcit.comp2522.bookstore;

/**
 * The Date class represents a specific date and provides methods for date validation
 * and determining the day of the week for the given date.
 *
 * <p>
 * This class supports years from 1800 to 2025, months from 1 to 12, and days depending on the month.
 * </p>
 *
 * @author Dominic Cheang
 * @author Bullen Kosa
 * @version 1.0
 */
public class Date {
    // Constant representing month names
    private static final String JANUARY   = "January";
    private static final String FEBRUARY  = "February";
    private static final String MARCH     = "March";
    private static final String APRIL     = "April";
    private static final String MAY       = "May";
    private static final String JUNE      = "June";
    private static final String JULY      = "July";
    private static final String AUGUST    = "August";
    private static final String SEPTEMBER = "September";
    private static final String OCTOBER   = "October";
    private static final String NOVEMBER  = "November";
    private static final String DECEMBER  = "December";

    // Constants representing the months of the year
    private static final int JANUARY_MONTH   = 1;
    private static final int FEBRUARY_MONTH  = 2;
    private static final int MARCH_MONTH     = 3;
    private static final int APRIL_MONTH     = 4;
    private static final int MAY_MONTH       = 5;
    private static final int JUNE_MONTH      = 6;
    private static final int JULY_MONTH      = 7;
    private static final int AUGUST_MONTH    = 8;
    private static final int SEPTEMBER_MONTH = 9;
    private static final int OCTOBER_MONTH   = 10;
    private static final int NOVEMBER_MONTH  = 11;
    private static final int DECEMBER_MONTH  = 12;

    // Constants representing days of the week
    private static final int SATURDAY  = 0;
    private static final int SUNDAY    = 1;
    private static final int MONDAY    = 2;
    private static final int TUESDAY   = 3;
    private static final int WEDNESDAY = 4;
    private static final int THURSDAY  = 5;
    private static final int FRIDAY    = 6;

    // Minimum and maximum values for years
    private static final int MIN_YEAR     = 1800;
    private static final int CURRENT_YEAR = 2025;

    // Minimum and maximum values for days and months
    private static final int FIRST_DAY_OF_MONTH = 1;
    private static final int LAST_DAY_OF_MONTH  = 31;
    private static final int FIRST_OF_MONTH     = 1;
    private static final int LAST_OF_MONTH      = 12;

    // Constants for Zeller's Congruence formula and year adjustments
    private static final int ZELLER_DIVISOR          = 5;
    private static final int ZELLER_MONTH_ADJUSTMENT = 13;

    // Century offset and divisor in Zeller's formula and constant to extract the last two digits of the year
    private static final int CENTURY_OFFSET  = 2;
    private static final int CENTURY_DIVISOR = 4;
    private static final int DIGIT_EXTRACTOR = 100;

    // Threshold years for pre-1900 and post-2000 calculations
    private static final int YEAR_THRESHOLD_1900 = 1900;
    private static final int YEAR_THRESHOLD_2000 = 2000;

    // Constants for day of the week calculations
    private static final int PRE_1900_ADJUSTMENT  = 2;
    private static final int POST_2000_ADJUSTMENT = 6;
    private static final int DAYS_IN_WEEK         = 7;

    // The year of the date
    private final int year;

    // The month of the date
    private final int month;

    // The day of the date
    private final int day;

    /**
     * Constructs a Date object with the specified year, month, and day.
     * Validates the year, month, and day to ensure they are valid.
     *
     * @param year  the year (must be between 1800 and 2025)
     * @param month the month (1 = January, 12 = December)
     * @param day   the day of the month
     */
    public Date(final int year,
                final int month,
                final int day) {
        validateYear(year);
        this.year = year;
        validateMonth(month);
        this.month = month;
        validateDay(day);
        this.day = day;
    }

    /**
     * Gets the year of the date.
     *
     * @return the year of the date
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the month of the date.
     *
     * @return the month of the date
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the day of the month of the date.
     *
     * @return the day of the month
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets the date in YYYY-MM-DD format.
     *
     * @return the date as a string in YYYY-MM-DD format
     */
    public String getYyyyMmDd() {
        String formattedDate;
        formattedDate = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
        return formattedDate;
    }

    /**
     * Determines the day of the week for the current date using Zeller's Congruence.
     *
     * <p>
     * This method calculates the day of the week for the date represented by the fields `year`,
     * `month`, and `day`. It uses Zeller's Congruence to compute the result, with additional
     * adjustments for dates before 1900 and after 2000 to ensure accuracy.
     * </p>
     *
     * <p>
     * **Steps of the method:**
     * <ol>
     *   <li>Store the current year and month in local variables `y` and `m`.</li>
     *   <li>If the month is January or February:
     *       <ul>
     *           <li>Treat January as month 13 and February as month 14 of the previous year.</li>
     *           <li>Increment `m` by 12 and decrement `y` by 1 to adjust for this change.</li>
     *       </ul>
     *   </li>
     *   <li>Extract the last two digits of the year (`lastTwoDigits`) and the century (`cent`).</li>
     *   <li>Apply Zeller's formula to calculate the day of the week:
     *       <ul>
     *           <li>Add the day of the month (`day`).</li>
     *           <li>Add an adjustment based on the month value.</li>
     *           <li>Add the last two digits of the year.</li>
     *           <li>Add the quotient of the last two digits divided by 4.</li>
     *           <li>Subtract an adjustment based on the century.</li>
     *           <li>Take the result modulo 7 to determine the day of the week.</li>
     *       </ul>
     *   </li>
     *   <li>If the year is before 1900, adjust the result to account for pre-1900 differences in the calendar.</li>
     *   <li>If the year is 2000 or later, apply a post-2000 adjustment to the result.</li>
     *   <li>Use a switch statement to map the numeric result (0–6) to the corresponding day of the week
     *       (Saturday to Friday).</li>
     * </ol>
     * </p>
     *
     * <p>
     * **Notes:**
     * <ul>
     *   <li>The method is designed to handle edge cases such as dates far in the past or future.</li>
     *   <li>If an invalid day of the week is calculated, the method throws an {@code IllegalStateException}.</li>
     * </ul>
     * </p>
     *
     * @return a string representing the day of the week (e.g., "Monday", "Tuesday").
     */
    public String getDayOfTheWeek() {
        int y;
        y = year;
        int m;
        m = month;

        if (m == JANUARY_MONTH || m == FEBRUARY_MONTH) {
            m += LAST_OF_MONTH;
            y--;
        }

        int lastTwoDigits;
        lastTwoDigits = y % DIGIT_EXTRACTOR;
        int cent;
        cent = y / DIGIT_EXTRACTOR;

        int dayOfWeek = (day +
                         (ZELLER_MONTH_ADJUSTMENT * (m + FIRST_OF_MONTH)) / ZELLER_DIVISOR +
                         lastTwoDigits +
                         (lastTwoDigits / CENTURY_DIVISOR) +
                         (cent / CENTURY_DIVISOR) -
                         (CENTURY_OFFSET * cent)) % DAYS_IN_WEEK;

        if (year < YEAR_THRESHOLD_1900) {
            dayOfWeek = (dayOfWeek + PRE_1900_ADJUSTMENT) % DAYS_IN_WEEK;
        } else if (year >= YEAR_THRESHOLD_2000) {
            dayOfWeek = (dayOfWeek + POST_2000_ADJUSTMENT) % DAYS_IN_WEEK;
        }

        return switch (dayOfWeek) {
            case SATURDAY -> "Saturday";
            case SUNDAY -> "Sunday";
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            default -> throw new IllegalStateException("Unexpected day of the week: " + dayOfWeek);
        };
    }

    /**
     * Converts a month number to its corresponding name.
     *
     * @param month the month number (1 = January, 12 = December)
     * @return the name of the month
     */
    public static String getMonthName(final int month) {
        return switch (month) {
            case JANUARY_MONTH -> JANUARY;
            case FEBRUARY_MONTH -> FEBRUARY;
            case MARCH_MONTH -> MARCH;
            case APRIL_MONTH -> APRIL;
            case MAY_MONTH -> MAY;
            case JUNE_MONTH -> JUNE;
            case JULY_MONTH -> JULY;
            case AUGUST_MONTH -> AUGUST;
            case SEPTEMBER_MONTH -> SEPTEMBER;
            case OCTOBER_MONTH -> OCTOBER;
            case NOVEMBER_MONTH -> NOVEMBER;
            case DECEMBER_MONTH -> DECEMBER;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }

    /*
     * Validates if the provided year is within the valid range.
     *
     * @param year the year to be validated
     */
    private static void validateYear(final int year) {
        if (year < MIN_YEAR || year > CURRENT_YEAR) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
    }

    /*
     * Validates if the provided month is within the valid range.
     *
     * @param month the month to be validated (1-12)
     */
    private static void validateMonth(final int month) {
        if (month < FIRST_OF_MONTH || month > LAST_OF_MONTH) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    /*
     * Validates if the provided day is within the valid range for a generic month.
     *
     * @param day the day to be validated (1-31)
     */
    private static void validateDay(final int day) {
        if (day < FIRST_DAY_OF_MONTH || day > LAST_DAY_OF_MONTH) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
    }
}

