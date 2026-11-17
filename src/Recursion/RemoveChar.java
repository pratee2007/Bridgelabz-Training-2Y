package Recursion;

public class RemoveChar {
    public static String remove(String s,int i,StringBuilder sb,char ch) {
        if(i == s.length()) return sb.toString();
        if(ch != s.charAt(i)) sb.append(s.charAt(i));
        return remove(s,i+1,sb,ch);
    }

    static void main(String[] args) {
        System.out.println(remove("Abhay Sorout",0,new StringBuilder(),'o'));
    }
}
