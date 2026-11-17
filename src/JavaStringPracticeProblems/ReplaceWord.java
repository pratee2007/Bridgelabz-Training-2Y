package JavaStringPracticeProblems;

import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String result = "";
        String current = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                current += ch;
            } else {
                if (current.equals(oldWord)) result += newWord;
                else result += current;
                result += " ";
                current = "";
            }
        }
        if (current.equals(oldWord)) result += newWord;
        else result += current;
        System.out.println(result);
    }
}

