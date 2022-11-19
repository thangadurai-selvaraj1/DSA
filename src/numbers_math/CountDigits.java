package numbers_math;

public class CountDigits {

    /**
     * Time complexity -  O(n)
     * */
   public static int countDigits(int num){
        int result = 0;
        while(num > 0){
            num /= 10;
            result++;
        }
        return  result;
    }
}
