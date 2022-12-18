package recursions;

import java.util.ArrayList;

public class ReverseTheArray {
    public static void main(String[] args) {
        for (int i : reverseArray(new int[]{1, 2, 3, 4,}, 0, 4)) {
            System.out.println(i);
        }
    }

    static int[] reverseArray(int[] arr, int left, int right){

        if(left>=right) return arr;

        swap(left,right-1,arr);
        reverseArray(arr,left+1,right-1);

        return arr;
    }


    static  void swap(int l, int r,int[] arr){
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}
