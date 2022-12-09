package bit_wise_operators;

public class CharProblems {

    public static void main(String[] args) {
        System.out.println(covertLowercaseToUpper('a'));
        System.out.println(covertUpperToLowercase('A'));
        System.out.println(findLetterOfPosition('Z'));
    }

    static char covertLowercaseToUpper(char value) {
        return (char) (value ^ ' ');
    }

    static char covertUpperToLowercase(char value) {
        return (char) (value | ' ');
    }

    ///Find a letter’s position in alphabet
    static int findLetterOfPosition(char value) {
        return value & 31;
    }

}
