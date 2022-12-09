package bit_wise_operators;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        swapNumbersWithoutTemp(2, 3);
    }
    public static void swapNumbersWithoutTemp(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = > " + a + " b => " + b);

        // Explain
        /**
         *
         *  1st - a = a^b;
         *  --------
         * a - 0..010
         * b - 0..011
         *    ----------
         * Xor - 0..001
         * a = 1
         * */

        /**
         *
         *  2nd - b = a^b;
         *  --------
         * a - 0..001
         * b - 0..011
         *    ----------
         * Xor - 0..010
         * b = 2
         * */

        /**
         *
         *  3rd - a = a^b;
         *  --------
         * a - 0..001
         * b - 0..010
         *    ----------
         * Xor - 0..011
         * a = 3
         * */
    }
}
