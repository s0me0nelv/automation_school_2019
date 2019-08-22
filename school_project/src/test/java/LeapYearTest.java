import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import practice.LeapYear;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    static LeapYear leapYear;

    @BeforeAll
    public static void prepare() {
        leapYear = new LeapYear();
        System.out.println("Checking entered year is Leap or Regular");
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2004, 2012, 2016, 2020})
    public void checkIfLeapYear(int year) {
        assertEquals("Leap", leapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2001, 2002, 2003, 2010, 2200})
    public void checkIfRegularYear(int year) {
        assertEquals("Regular", leapYear.isLeapYear(year));
    }

    @Test
    public void checkYear2008() {
        assertEquals("Leap", leapYear.isLeapYear(2008));
    }

    @Test
    public void checkYear2100() {
        assertEquals("Regular", leapYear.isLeapYear(2100));
    }

    @Test
    public void checkNegativeYear() {
        assertEquals("Not valid year", leapYear.isLeapYear(-2000));
    }

    @Test
    public void checkNegative1899() {
        assertEquals("Not valid year", leapYear.isLeapYear(1899));
    }

    @Test
    public void checkNegative() {
        assertEquals("Not valid year", leapYear.isLeapYear(3000));
    }

    @AfterAll
    public static void end() {
        System.out.println("Tesing is finished");
    }
}
