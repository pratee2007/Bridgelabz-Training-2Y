package Recursion;

public class StringLength {
    public static int len(String s) {
        if(s.equals("")) return 0;
        return 1 + len(s.substring(1));
    }

    static void main(String[] args) {
        System.out.println(len("Abhay"));
    }
}
