package recursions;

public class Polindrome {
    public static void main(String[] args) {

        String name = "mom";
        System.out.println(isPalind(name,0,name.length()-1));
    }

    static boolean isPalind(String str,int left, int right){
        if (str.charAt(left) != str.charAt(right) ) return  false;
        if (left>=right) return  true;
        return isPalind(str,left+1,right-1);
    }
}
