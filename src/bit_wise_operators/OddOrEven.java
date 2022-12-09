package bit_wise_operators;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(isOddOrEven(2));
    }

    /**
     * using AND
     */
    public static String isOddOrEven(int n) {
        return ((n & 1) == 1) ? "odd" : "even";
    }


}
