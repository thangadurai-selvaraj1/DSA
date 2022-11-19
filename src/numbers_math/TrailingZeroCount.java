package numbers_math;

public class TrailingZeroCount {

    /**
     * Time complexity -  O(n)
     * for Small number we can get but more than 5 program will stuck
     */
    public static int getTrailingZeroCountInFact(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
        }
        int count = 0;
        while (result % 10 == 0) {
            count++;
            result = result / 10;
        }

        return count;
    }
    /**
     * Time complexity -  O(log n)
     */
    public static int getTrailingZeroCountInFactInEfficientWay(int num) {
        int result = 0;
        for (int i = 5; i <= num; i = i * 5) {
            result += num / i;
        }

        return result;
    }
}
