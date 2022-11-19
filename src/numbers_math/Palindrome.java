package numbers_math;

public class Palindrome {

    /**
     * Time complexity -  O(n)
     * */
    public static boolean isPalindrome(int num){
        int result = 0;
        int temp = num;

        while(num > 0){
            int r = num % 10;
            result = (result * 10) + r;
            num /= 10;
        }
        return  result == temp;
    }

    /**
     * Time complexity -  O(n)
     * */
    public static boolean isPalindromeString(String value){
        StringBuilder result = new StringBuilder();
        for(int i = value.length()-1;i>=0;i--){
            result.append(value.charAt(i));
        }
        return result.toString().equals(value);
    }
}
