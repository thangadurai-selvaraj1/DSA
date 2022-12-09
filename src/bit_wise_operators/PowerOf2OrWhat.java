package bit_wise_operators;

public class PowerOf2OrWhat {
    public static void main(String[] args) {
        System.out.println(checkPositiveNumberPowerOfTwo(2));
    }

    ///Check if a positive integer is a power of 2 without using any branching or loop.
    static boolean checkPositiveNumberPowerOfTwo(int n) {
        return (n & n - 1) == 0;
    }

}
