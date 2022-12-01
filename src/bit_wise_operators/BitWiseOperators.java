package bit_wise_operators;

public class BitWiseOperators {

    /**
     * using AND
     * */
    public  static  String isOddOrEven(int n){
        return ((n&1)==1) ? "odd" : "even";
    }

}
