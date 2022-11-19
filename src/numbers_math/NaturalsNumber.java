package numbers_math;

public class NaturalsNumber {

    /**
     * Time complexity -  O(1)
     * */
    public static int getNaturalNumber(int n){
        return n * (n+1)/2;
    }

    /**
     * Time complexity -  O(n)
     * */
    public static int getNaturalNumber2(int n){
        int result =0;
      for(int i=0;i<=n;i++){
          result += i;
      }
      return  result;
    }
}
