package Recursion;

public class StrEqual {
    public static boolean eq(String s,String t,int i) {
        if(s.length() != t.length()) return false;
        if(i == s.length()) return true;
        if(s.charAt(i) != t.charAt(i)) return false;
        return eq(s,t,i+1);
    }

    static void main(String[] args) {
        System.out.println(eq("Abhy","Abhay",0));
    }
}
