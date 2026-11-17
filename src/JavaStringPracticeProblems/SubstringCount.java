package JavaStringPracticeProblems;

import java.util.Scanner;
public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) count++;
        }
        System.out.println(count);
    }
}
