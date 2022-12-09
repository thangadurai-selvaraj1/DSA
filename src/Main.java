import numbers_math.*;
import problems.First_Occurrence_Char;
import recursions.Recursions;
import utils.Print;

public class Main {
    public static void main(String[] args) throws Exception {
        Print.print(CountDigits.countDigits(1234));
        Print.print(NaturalsNumber.getNaturalNumber(4));
        Print.print(NaturalsNumber.getNaturalNumber2(4));
        Print.print(Palindrome.isPalindrome(22));
        Print.print(Palindrome.isPalindromeString("mom"));
        Print.print(Factorial.findFactorial(5));
        Print.print(Factorial.findFactorialRecursion(4));
        Print.print(TrailingZeroCount.getTrailingZeroCountInFact(5));
        Print.print(TrailingZeroCount.getTrailingZeroCountInFactInEfficientWay(25));
        Print.print(GCD.findLargestNumGCM(45,15));
        Print.print(GCD.findSmallestNumWithOutOneGCM(45,15));
        Print.print(GCD.findLargestNumGCMWithEfficientWay(45,15));
        Print.print(GCD.findLargestNumGCMWithEfficientWayInRecursion(15,45));
        Print.print(PrimeNumber.isPrimeNumber(23));
        Recursions.printNumbers(4);

        Print.print(First_Occurrence_Char.firstOccurrence("abbag"));
    }
}