package arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
reverseTheArray(new int[] {1,2,3,4,5});
    }

    static  void reverseTheArray(int[] arr){
        int n = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n - i] = temp;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
