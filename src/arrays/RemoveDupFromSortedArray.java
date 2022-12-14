package arrays;

public class RemoveDupFromSortedArray {

    public static void main(String[] args) {
        removeDuplicatesAndReturnSizeOfTheArray(new int[]{10, 10, 20, 30, 30});
    }

    /**
     * TC - O(n)
     * Space - O(1)
     * */
    static void removeDuplicatesAndReturnSizeOfTheArray(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[i - 1] = arr[i];
                count++;
            }
        }
        System.out.println("Size of the array " + count );
    }
}
