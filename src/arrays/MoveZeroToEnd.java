package arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        moveZeroToEnd(new int[]{0, 5, 0, 5, 0, 7});
    }

    static void moveZeroToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
