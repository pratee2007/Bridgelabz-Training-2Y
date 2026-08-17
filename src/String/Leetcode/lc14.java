package String.Leetcode;
import java.util.Arrays;

public class lc14 {

    public static void main(String[] args) {
     String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb =new StringBuilder();

        int i = 0;
        int n = strs.length - 1;
        int maxLength = Math.max(strs[0].length(), strs[n].length() );

        while(strs[0].charAt(i) == strs[n].charAt(i) && i < maxLength){
            sb.append(strs[0].charAt(i));
            i++;
        }
        return sb.toString();
    }
}
