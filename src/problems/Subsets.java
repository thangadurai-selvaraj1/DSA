package problems;

public class Subsets {
    public static void main(String[] args) {
        printSubSets("","abc");
        System.out.println(getSubSetsPairCount(new int[]{10,15,20},3,25));
    }

    public static void printSubSets(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char e = up.charAt(0);
        printSubSets(p, up.substring(1));
        printSubSets(p + e, up.substring(1));
    }

    public static int getSubSetsPairCount(int[] a, int length,int sum) {
        if(length==0)
            return (sum==0) ? 1:0;
        return getSubSetsPairCount(a,length-1,sum)
                + getSubSetsPairCount(a,length-1,sum - a[length-1]);
    }
}
