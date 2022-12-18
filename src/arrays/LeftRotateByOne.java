package arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        //leftRotateOnArray(new int[]{1,2,3,4,5,6},2);
        leftRotateOnArrayWithEffi(new int[]{1,2,3,4,5,6},2);
    }

    /**
     * Time - O(n*k)
     * Space - O(1)
     * */
    static void leftRotateOnArray(int[] arr,int k){
        for (int j = 0; j <k; j++) {
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                arr[i]= arr[i-1];
                arr[i-1] = temp;
            }

        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * Time - O(n)
     * Space - O(1)
     * */
    static void leftRotateOnArrayWithEffi(int[] arr,int k){
        reverseTheArray(arr,0,k-1);
        reverseTheArray(arr,k, arr.length-1);
        reverseTheArray(arr,0, arr.length-1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static  void reverseTheArray(int[] arr,int left,int right){

        while (left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
