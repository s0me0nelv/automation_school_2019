package practice;

public class RandomPassword {
    public String getRandomPassword(int a, int b, int c, int n) {

        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvxyz";
        String numbers = "0123456789";

        StringBuilder sb = new StringBuilder(n);
        int index = (int) (lowerChars.length() * Math.random());
        int index2;
        for (int i = 0; i < n; i++) {
            do {
                index2 = (int) (lowerChars.length() * Math.random());
            } while (index2 == index);
            index = index2;
            sb.append(lowerChars.charAt(index2));
        }
        if (n == 1 && a == 1) {
            sb.setCharAt(0, upperChars.charAt(index));
        } else {
            for (int i = 0; i < a; i++) {
                do {
                    index2 = (int) (upperChars.length() * Math.random());
                } while (index2 == index);
                index = index2;
                sb.setCharAt(i, upperChars.charAt(index2));
            }
        }
        if (n == 1 && c == 1) {
            sb.setCharAt(0, '7');
        } else {
            for (int i = a; i < a + c; i++) {
                do {
                    index2 = (int) (numbers.length() * Math.random());
                } while (index2 == index);
                index = index2;
                String s = Integer.toString(index2);
                sb.setCharAt(i, s.charAt(0));
            }
        }

        return sb.toString();
    }
}

