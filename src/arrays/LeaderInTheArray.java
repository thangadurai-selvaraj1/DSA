package arrays;

import java.util.ArrayList;

public class LeaderInTheArray {

    public static void main(String[] args) {
        leaderInTheRightArray(new int[]{7,10,4,3,6,5,2});
    }

    /**
     * Time O(n)
     * Space O(n)
     * */
    static void leaderInTheRightArray(int[] arr){

        ArrayList<Integer> temp = new ArrayList<>();
        int leader = arr[arr.length-1];
        temp.add(leader);
        for (int i =arr.length-2 ;i>0;i--){
            if(leader<arr[i]){
                leader = arr[i];
                temp.add(leader);
            }
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.println(temp.get(i));
        }
    }
}
