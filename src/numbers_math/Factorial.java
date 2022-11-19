package numbers_math;

public class Factorial {

    /**
     * Iterate Impl
     * Time complexity -  O(n)
     */
    public static int findFactorial(int num) {

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Recursion Impl
     * Time complexity -  O(n)
     */
    public static int findFactorialRecursion(int num) {
        if (num == 0) {
            return 1;
        }
        return findFactorialRecursion(num - 1) * num;
    }

}
