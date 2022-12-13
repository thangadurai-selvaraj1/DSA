package arrays;

public class FindArraySorted {
    public static void main(String[] args) {
        System.out.println(findArrayIsSortedOrNot(new int[]{1, 1}));
        System.out.println(findArrayIsSortedOrNotMoreEfficientWay(new int[]{1, 1}));
    }

    static boolean findArrayIsSortedOrNot(int[] arr) {
        int pre = 0;
        int next = 1;
        while (next != arr.length) {
            if (arr[pre] > arr[next]) {
                return false;
            }
            next++;
            pre++;
        }
        return true;
    }

    static boolean findArrayIsSortedOrNotMoreEfficientWay(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
