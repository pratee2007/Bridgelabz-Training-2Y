package Arrays.Leetcode;

import java.util.Arrays;

public class lc1365 {
    public static void main(String[] args) {
        int[] nums={8,5,3,2,1};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[]  ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]> nums[j]) ans[i]++;
            }
        }
        return ans;

    }

}
