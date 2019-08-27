import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LuckyNumberTest {

    LuckyNumber luckyNumber = new LuckyNumber();

    @Test
    public void checkSymetricNumber() {
        assertEquals("YES", luckyNumber.isFirstSumOfDigitsEqualSecond("123321"));
    }

    @Test
    public void checkAscedingNumberSequence() {
        assertEquals("NO", luckyNumber.isFirstSumOfDigitsEqualSecond("123456"));
    }

    @Test
    public void checkTwoSameDigitNumber() {
        assertEquals("YES", luckyNumber.isFirstSumOfDigitsEqualSecond("55"));
    }

    @Test
    public void checkTwoDifferentDigitNumber() {
        assertEquals("NO", luckyNumber.isFirstSumOfDigitsEqualSecond("54"));
    }

    @Test
    public void checkStringValueEntered() {
        assertEquals("NO", luckyNumber.isFirstSumOfDigitsEqualSecond("abbc"));
    }

    @Test
    public void checkIfOddNumberEntered() {
        assertEquals("NO", luckyNumber.isFirstSumOfDigitsEqualSecond("123"));
    }
}
