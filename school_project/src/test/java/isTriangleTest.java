import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import practice.DivideByFive;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class isTriangleTest {

    static Triangle triangle;

    @BeforeAll
    public static void prepare() {
        triangle = new Triangle();
        System.out.println("Checking if triangle could exist with given integers");
    }


    @Test
    public void isTriangleTrue() {

        assertEquals("YES", triangle.isTriangle(5, 6, 8));

    }

    @Test
    public void isTriangleFalse() {

        assertEquals("NO", triangle.isTriangle(5, 2, 8));

    }

    @Test
    public void isTriangleFalseWithZero() {

        assertEquals("NO", triangle.isTriangle(5, 2, 0));

    }

    @Test
    public void isTriangleFalseWithNegative() {

        assertEquals("NO", triangle.isTriangle(5, 2, -1));

    }

    @Test
    public void isTriangleTrueWithSameSides() {

        assertEquals("YES", triangle.isTriangle(1, 1, 1));

    }

    @AfterAll
    public static void end() {

        System.out.println("Tesing is finished");
        triangle=null;
    }

}
