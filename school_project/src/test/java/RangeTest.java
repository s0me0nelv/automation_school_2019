import org.junit.jupiter.api.Test;
import practice.Range;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeTest {
    Range range = new Range();

    @Test
    public void checkFromZeroToTenWithSameValues() {
        assertEquals(2, range.doTwoRangesHaveSameValues(0, 10, 9, 12));
    }

    @Test
    public void checkFromZeroToTenWithoutSameValues() {
        assertEquals(0, range.doTwoRangesHaveSameValues(0, 10, 11, 15));
    }

    @Test
    public void checkIfSecondRangeSmaller() {
        assertEquals(0, range.doTwoRangesHaveSameValues(0, 10, -5, -1));
    }

    @Test
    public void checkIfSecondRangeSmallerWithSameZero() {
        assertEquals(1, range.doTwoRangesHaveSameValues(0, 10, -5, 0));
    }

    @Test
    public void checkIfSInvalidNumbers() {
        assertEquals(0, range.doTwoRangesHaveSameValues(1, 0, -5, 0));
    }
}
