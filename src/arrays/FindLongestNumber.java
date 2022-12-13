package arrays;

public class FindLongestNumber {
    public static void main(String[] args) {
        System.out.println(findLongestNumber(new int[]{8, 9, 0, 8, 5, 3}));
        System.out.println(findLongestNumberEfficientWay(new int[]{1, 2, 3, 4, 5}));
        findSecondLongestNumberEfficientWay(new int[]{1, 29, 39, 4, 5,});
        findSecondLongestNumberInSingleLoop(new int[]{1, 13, 100, 4});
    }

    /**
     * Naive Solution
     * TC - O(n2)
     */
    static int findLongestNumber(int[] arr) {
        for (int i : arr) {
            boolean flag = true;
            for (int j : arr) {
                if (j > i) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }

    /**
     * TC - O(n)
     */
    static int findLongestNumberEfficientWay(int[] arr) {
        int res = arr[0];
        for (int i : arr) {
            if (i > res)
                res = i;
        }
        return res;
    }


    /**
     * TC - O(n)
     * but two loops
     */
    static void findSecondLongestNumberEfficientWay(int[] arr) {
        int large = findLongestNumberEfficientWay(arr);
        int res = -1;
        for (int i : arr) {
            if (large != i) {
                if (res == -1) {
                    res = i;
                }
                if (i > res) {
                    res = i;
                }
            }
        }
        System.out.println(res);
    }

    static void findSecondLongestNumberInSingleLoop(int[] arr) {
        int large = arr[0];
        int res = -1;
        for (int i : arr) {
            if (large != i) {
                if (res == -1 || i > res) {
                    res = large;
                    large = i;
                }
            }
        }
        System.out.println(res);
    }
}
