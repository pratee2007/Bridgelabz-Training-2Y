package Recursion;

public class CharFreq {
    public static int vow(String s,int i,int c,char ch) {
        if(i == s.length()) return c;
        if(s.charAt(i) == ch) c++;
        return vow(s,i+1,c,ch);
    }

    static void main(String[] args) {
        System.out.println(vow("aeibhayaa",0,0,'a'));
    }
}
