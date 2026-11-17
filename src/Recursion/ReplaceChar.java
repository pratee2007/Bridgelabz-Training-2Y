package Recursion;

public class ReplaceChar {
    public static String remove(String s,int i,StringBuilder sb) {
        if(i == s.length()) return sb.toString();
        if(s.charAt(i) == 'a') sb.append('b');
        else sb.append(s.charAt(i));
        return remove(s,i+1,sb);
    }

    static void main(String[] args) {
        System.out.println(remove("Abhay Sorout",0,new StringBuilder()));
    }
}
