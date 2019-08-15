import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleMethodTest {


    @Test
    public void returnFour() {

        assertEquals(4, SimpleMethod.calculateAverage(3, 5));
        System.out.println(SimpleMethod.calculateAverage(3, 5));

    }


    @Test
    public void checkNegative() {

        assertEquals(-2, SimpleMethod.calculateAverage(6, -10));
        System.out.println(SimpleMethod.calculateAverage(6, -10));

    }

    @Test
    public void checkZero() {

        assertEquals(0, SimpleMethod.calculateAverage(6, -6));
        System.out.println(SimpleMethod.calculateAverage(6, -6));

    }

}
