package Recursion;

public class ReverseString {
    public static String reverse(String s,int i) {
        if(i < 0) return "";
        return s.charAt(i) + reverse(s,i-1);
    }

    static void main(String[] args) {
        String s = "Abhay";
        System.out.println(reverse(s,s.length() - 1));
    }
}
