import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import practice.RandomPassword;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomPasswordTest {
    RandomPassword randomPassword = new RandomPassword();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 10, 20, 200, 1000})
    public void checkRandomPasswordLength (int n) {
        assertEquals(n, randomPassword.getRandomPassword(0, 0, 1, n).length());
    }

    @Test
    public void checkRandomPasswordUpperCaseLetters() {
        assertTrue(randomPassword.getRandomPassword(3,5,1,9).matches("^(.*[A-Z]){3,}.*$"));
    }

    @Test
    public void checkRandomPasswordLowerCaseLetters() {
        assertTrue(randomPassword.getRandomPassword(3,2,1,6).matches("^(.*[a-z]){2,}.*$"));
    }

    @Test
    public void checkRandomPasswordNumbers() {
        assertTrue(randomPassword.getRandomPassword(3,3,4,10).matches("^(.*[0-9]){4,}.*$"));
    }
}
