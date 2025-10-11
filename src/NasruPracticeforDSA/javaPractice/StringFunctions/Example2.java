package NasruPracticeforDSA.javaPractice.StringFunctions;

public class Example2 {

        static int getLastDigit(String a, String b) {
            // If b is "0", anything^0 = 1
            if (b.equals("0"))
                return 1;

            // Get last digit of a
            int lastDigitA = a.charAt(a.length() - 1) - '0';

            // Find b % 4 (since last digit cycle repeats every 4)
            int mod = 0;
            for (int i = 0; i < b.length(); i++) {
                mod = (mod * 10 + (b.charAt(i) - '0')) % 4;
            }

            if (mod == 0) mod = 4; // if divisible by 4, take full cycle

            // Compute (a^b) % 10 using modular exponentiation logic
            int result = (int)Math.pow(lastDigitA, mod) % 10;

            return result;
        }

    public static void main(String[] args) {
        System.out.println(getLastDigit("4","13"));

    }


}
