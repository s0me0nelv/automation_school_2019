public class LuckyNumber {
    public String isFirstSumOfDigitsEqualSecond(String n) {
        int length = n.length();
        int length2 = length / 2;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < length2; i++) {
            int x = Character.getNumericValue(n.charAt(i));
            sum1 = sum1 + x;
        }

        for (int i = length2; i <= length - 1; i++) {
            int x = Character.getNumericValue(n.charAt(i));
            sum2 += x;
        }

        if (sum1 == sum2) {
            return "YES";
        } else
            return "NO";
    }
}
