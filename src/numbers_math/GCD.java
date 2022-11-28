package numbers_math;

public class GCD {

    public static int findLargestNumGCM(int a, int b) {
        int result = Math.min(a, b);
        while (result != 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }


    public static int findLargestNumGCMWithEfficientWay(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int findLargestNumGCMWithEfficientWayInRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findLargestNumGCMWithEfficientWayInRecursion(b, a % b);
    }

    public static int findSmallestNumWithOutOneGCM(int a, int b) {
        int result = 0;
        int min = Math.min(a, b);
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }
        return result == 0 ? -1 : result;
    }
}
