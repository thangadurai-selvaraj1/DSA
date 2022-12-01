package recursions;

import utils.Print;

import java.util.HashMap;
import java.util.Map;

public class Recursions {
    /**
     * Print N to 1
     * */
    public static void printNumbers(int n){
        if(n==0)
            return;
        printNumbers(n-1);
        Print.print(n);
    }
}
