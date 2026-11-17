package Recursion;

public class PrintChar {
    public static void print(String s,int i) {
        if(i == s.length()) return;
        System.out.println(s.charAt(i));
        print(s,i+1);
    }

    static void main(String[] args) {
        print("Abhay",0);
    }
}
