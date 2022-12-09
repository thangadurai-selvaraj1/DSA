package bit_wise_operators;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(19));
        System.out.println(countSetBitsBrianKernighanAlgo(19));
    }

    /**
     * Brute-Force Solution
     * O(n)
     */
    static int countSetBits(int n) {
        int count = 0;
        int iteration = 0; // for counting iteration
        while (n != 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;

            iteration++;
        }
        System.out.println("iteration => " + iteration);
        return count;
    }

    /**
     * Using Brian Kernighan’s algorithm
     * O(log n)
     */
    static int countSetBitsBrianKernighanAlgo(int n) {
        int count = 0;
        int iteration = 0; // for counting iteration
        while (n != 0) {
            n = n & n - 1;
            count++;
            iteration++;
        }
        System.out.println("iteration => " + iteration);
        return count;
    }
}
