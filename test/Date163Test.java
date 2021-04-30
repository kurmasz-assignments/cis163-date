import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Sample tests to help students get started.
 */
public class Date163Test {

  /*********************************************************************************
   *
   * .isLeapYear (the dot indicates this is a static method)
   *
   **********************************************************************************/

  // The simplest way to write a test is just to annotate a public void method
  // with @Test, then include some sort of assert method:
  @Test
  public void notALeapYear() {
    assertFalse(Date163.isLeapYear(1957));
  }

  @Test
  public void isLeapYear() {
    assertTrue(Date163.isLeapYear(1956));
  }

  // JUnit5 adds some additional features that let you define a
  // entire set of tests at once
  @ParameterizedTest
  @DisplayName(".isLeapYear recognizes 'regular' years")
  @ValueSource(ints = { 1997, 1998, 1999 })
  public void regularYearStatic(int year) {
    assertFalse(Date163.isLeapYear(year), year + " should be a regular year");
  }

  /*********************************************************************************
   *
   * #isLeapYear (the hash indicates this is an instance method)
   *
   **********************************************************************************/

  // To test instance methods,
  @ParameterizedTest
  @DisplayName("#isLeapYear recognizes 'regular' years")
  @ValueSource(ints = { 1997, 1998, 1999 })
  public void regularYearInstance(int year) {
    Date163 d = new Date163(5, 15, year);
    assertFalse(d.isLeapYear(), year + " should be a regular year");
  }

  /*********************************************************************************
   *
   * .daysInYear
   *
   **********************************************************************************/

  @Test
  @DisplayName(".daysInYear recognizes 'regular' year")
  public void daysInYearRegularStatic() {
    assertEquals(365, Date163.daysInYear(1982));
  }

  /*********************************************************************************
   *
   * .isValid
   *
   **********************************************************************************/

  // Here is a cool way to pass complex data to a test
  @ParameterizedTest
  @DisplayName(".isValid recognizes day too large")
  @CsvSource({"1, 32, 2020", "2, 30,  2020", "3, 32, 2020" })
  public void recognizesDayTooLarge(int month, int day, int year) {
    assertFalse(Date163.isValidDate(month, day, year));
  }

  /*********************************************************************************
   *
   * #constructor(int, int, int)
   *
   **********************************************************************************/

  @ParameterizedTest
  @DisplayName("#constructor(int, int, int) sets month, day, and year correctly")
  @CsvSource({ "1/1/2020", "2/15/2020", "3/13/2020" })
  public void constructorWorks(String date) {

    // Move this code to a helper method if you are use it in many methods.
    String[] parts = date.split("/");
    int month = Integer.parseInt(parts[0]);
    int day = Integer.parseInt(parts[1]);
    int year = Integer.parseInt(parts[2]);

    Date163 d = new Date163(month, day, year);
    assertEquals(month, d.getMonth());
    assertEquals(day, d.getDay());
    assertEquals(year, d.getYear());
  }

}
