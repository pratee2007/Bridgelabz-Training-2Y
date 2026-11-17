package Logical_problems;

public class DuplicateInSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) if(nums[i] != nums[i - 1]) nums[k++] = nums[i];
        return k;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,6,7,7,8,8,9};
    }
}
