package Arrays.Leetcode;
import java.util.*;
public class lc1389 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] ind={0,1,2,2,4};
        createTargetArray(arr,ind);

    }

     static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            lst.add(index[i], nums[i]);
        }
        int[] res = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i] = lst.get(i);
        }
        return res;
    }
}
