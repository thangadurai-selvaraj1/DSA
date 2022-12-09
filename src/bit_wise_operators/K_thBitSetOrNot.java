package bit_wise_operators;

public class K_thBitSetOrNot {

    public static void main(String[] args) {
        System.out.println(checkKthBitSetOrNot(4,3));
        System.out.println(checkKthBitSetOrNotInOneLine(4,3));
    }

    static boolean checkKthBitSetOrNot(int n, int k) {
        int pos = 0;
        while (n != 0) {
            pos++;
            if ((n & 1) == 1) break;
            n = n >> 1;
        }
        return k == pos;
    }

    static boolean checkKthBitSetOrNotInOneLine(int n, int k) {
        return (1 & (n >> k - 1)) == 1;
    }
}
