import numbers_math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(CountDigits.countDigits(1234));
        System.out.println(NaturalsNumber.getNaturalNumber(4));
        System.out.println(NaturalsNumber.getNaturalNumber2(4));
        System.out.println(Palindrome.isPalindrome(22));
        System.out.println(Palindrome.isPalindromeString("mom"));
        System.out.println(Factorial.findFactorial(5));
        System.out.println(Factorial.findFactorialRecursion(4));
        System.out.println(TrailingZeroCount.getTrailingZeroCountInFact(5));
        System.out.println(TrailingZeroCount.getTrailingZeroCountInFactInEfficientWay(25));
    }
}