package Arrays.Leetcode;

public class lc485 {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,1,1,1};
        findMaxConsecutiveOnes(nums);
    }

    public static void findMaxConsecutiveOnes(int[] nums) {
        int mcount=0;
        int ccount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)
                ccount++;
            else {
                mcount= Math.max(mcount,ccount);
                ccount=0;
            }
        }
        int k= mcount>ccount ? mcount : ccount;
        System.out.println(k);
    }
}