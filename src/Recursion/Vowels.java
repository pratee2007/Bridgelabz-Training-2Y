package Recursion;

public class Vowels {
    public static boolean check(char ch) {
        return ch == 'a' ||ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int vow(String s,int i,int c) {
        if(i == s.length()) return c;
        if(check(s.charAt(i))) c++;
        return vow(s,i+1,c);
    }

    static void main(String[] args) {
        System.out.println(vow("abhayaa",0,0));
    }
}
