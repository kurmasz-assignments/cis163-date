/**
 *
 * Stores and analyzes calendar dates.
 *
 * @author Zachary Kurmas
 */
// (C) 2008 Zachary Kurmas
public class Date163 {

   /**
    * Enumerates the days of the week ({@code Sunday}, ..., {@code Saturday}).
    */
   public static enum DayOfWeek {
      Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   }

   /**
    * Minimum allowable year (currently set to {@code 1753}). If earlier years are
    * allowed, we have to worry about the switch from the Julian to Gregorian
    * calendar.
    */
   public static final int MIN_YEAR = 1753;

   private int month;
   private int day;
   private int year;

   // 

   /**
    * Returns {@code true} if {@code year} is in a leap year, {@code false}
    * otherwise.
    *
    * @param year the year
    * @return {@code true} if {@code year} is a leap year, {@code false} otherwise.
    */
   public static boolean isLeapYear(int year) {

      boolean answer = false;

      // 

      return answer;
   }

   /**
    * Returns {@code true} if {@code day}, {@code month}, and {@code year}
    * represent a valid date, {@code false otherwise}.
    *
    * @param month month (1=January, 2=February, etc.)
    * @param day   day of the month
    * @param year  four digit year
    * @return {@code true} if {@code day}, {@code month}, and {@code year}
    *         represent a valid date, {@code false otherwise}.
    */
   public static boolean isValidDate(int month, int day, int year) {

      boolean answer = false;

      // 

      return answer;
   }

   /**
    * Returns the number of days in {@code year}.
    *
    * @param year year
    * @return the number of days in {@code year}.
    */
   public static int daysInYear(int year) {

      int answer = 0;

      // 

      return answer;
   }

   /**
    * Constructor taking month, day, and year as integers.
    *
    * @param month the month
    * @param day   the day
    * @param year  the year
    * @throws IllegalArgumentException if {@code month}/{@code day}/{@code year}
    *                                  doesn't represent a valid date.
    */
   public Date163(int month, int day, int year) {

      // 
   }

   /**
    * A constructor that accepts {@code String}s of the form "{@code M/D/YYYY}" or
    * "{@code M/D/YY}".
    *
    * @param date A {@code String} in "{@code M/D/YYYY}" or "{@code M/D/YY} format.
    * @throws IllegalArgumentException if {@code date} doesn't represent a valid
    *                                  date.
    */
   public Date163(String date) {

      // 
   }

   /**
    * Returns the month (January is 1, February is 2, ..., December is 12)
    * 
    * @return the month
    */
   public int getMonth() {
      return month;
   }

   /**
    * Returns the day (numbered 1 .. 31)
    * 
    * @return the day
    */
   public int getDay() {
      return day;
   }

   /**
    * Returns the full, four-digit year.
    * 
    * @return the year
    */
   public int getYear() {
      return year;
   }

   /**
    * Returns {@code true} if the two objects return the same date, {@code false}
    * otherwise.
    * 
    * @param other the other {@code SimpleDate}
    * @return {@code true} if the two objects return the same date, {@code false}
    *         otherwize.
    */

   public boolean equals(Date163 other) {
      boolean answer = false;

      // 

      return answer;
   }

   /**
    * Returns {@code true} if the two objects return the same date, {@code false}
    * otherwise (including if the other object isn't a {@code SimpleDate}).
    *
    * @param other the other object to compare
    * @return {@code true} if the two object represent the same date, {@code false}
    *         otherwise.
    */
   public boolean equals(Object other) {
      if (other instanceof Date163) {
         return this.equals((Date163) other);
      } else {
         return false;
      }
   }

   /**
    * Return a value < 0 if this date comes before {@code other}. Return 0 if the
    * dates are equal Return a value > 0 if this date comes after {@code oter}
    * 
    * @param other
    * @return an integer representing which date comes first.
    */
   public int compareTo(Date163 other) {
 
      int answer = 0;

      // 

      return answer;
   }

   /**
    * Returns a relatively unique integer describing this date.
    *
    * @return a relatively unique integer describing this date.
    */
   @Override
   public int hashCode() {
      return 366 * getYear() + ordinalDate();
   }

   /**
    * Return a {@code String} describing this date. For example, "Tuesday, 28
    * April, 2020"
    *
    * @return a {@code String} describing this date
    */
   public String toString() {

      String answer = null;

      // 

      return answer;
   }

   /**
    * Determines whether the current date is part of a leap year.
    * 
    * @return wither the current date is part of a leap year.
    */
   public boolean isLeapYear() {
      boolean answer = false;

      // 

      return answer;
   }

   /**
    * Returns the number of days in the current year.
    *
    * @return the number of days in the current year
    */
   public int daysInYear() {
      int answer = 0;

      // 

      return answer;
   }

   /**
    * Counts how far this date is into the current year. For example, the ordinal
    * date (also called the "Julian date") of 1 January is 1. The ordinal date of 1
    * February is 32, the ordinal date of Christmas is 359 (in an non-leap year)
    * 
    * @return this date's "Julian" date.
    */
   public int ordinalDate() {
      int answer = 0;

      // 

      return answer;
   }

   /**
    * The number of days that have elapsed since {@code other}. If {@code other} is
    * in the past, then the answer will be negative.
    * 
    * @param other the other date.
    * 
    * @return the number of days that have elapsed since {@code other}
    */
   public int daysSince(Date163 other) {

      // Hint: It is acceptable to brute force this using a loop. Each iteration of
      // the loop should represent one year.

      int answer = 0;

      // 

      return answer;
   }

   /**
    * Return the current day of the week (Sunday, Monday, Tuesday, etc.)
    * 
    * @return the current day of the week
    */
   public DayOfWeek dayOfWeek() {

      DayOfWeek answer = DayOfWeek.Sunday;

      // 

      return answer;
   }

   /**
    * Set the smallest value to which a two-digit year refers (<em>may be
    * optional</em>). For example, setting the minimum two-digit year to 1930 means
    * that "8/13/30" refers to 1930, whereas "8/13/29" refers to 2029. Note: The
    * parameter {@code cutoff} should be a four digit-year.
    *
    * @param cutoff the smallest year to which a two-digit year refers.
    * @throws IllegalArgumentException if {@code cutoff < MIN_YEAR}.
    */
   public static void setMinTwoDigitYear(int cutoff) {

      // 

   }

   /**
    * Return the minimum year represented by two digits .
    *
    * @return the minimum year represented by two digits.
    * @see #setMinTwoDigitYear
    */
   public static int getMinTwoDigitYear() {
      int answer = 0;

      // 

      return answer;
   }

   // 

} // end Date163 afzqx
