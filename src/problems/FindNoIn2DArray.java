package problems;

public class FindNoIn2DArray {
    public static void main(String[] args) {
        findTheNumber(new int[][]{{1,2,3},{4,5,6},{7,8,9}},3,9);
    }

    /// We took top right corner approach
    public static void findTheNumber(int[][] a, int n,int k) {
        int row = 0;
        for (int i = 0; i < n; i++) {
            if(a[i][n-1]>=k){
                row = i;
                break;
            }
        }

        for (int i = n-1; i > 0; i--) {
            if(a[row][i]==k){
                System.out.println("found => "+a[row][i]);
            }
        }
    }
}
