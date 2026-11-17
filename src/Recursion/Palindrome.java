package Recursion;

public class Palindrome {
    public static boolean pal(String s,int i) {
        if(i > s.length() / 2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return pal(s,i+1);
    }

    static void main(String[] args) {
        System.out.println(pal("maadam",0));
    }
}
