package Logical_problems;

class ThirdLargest {
    public static int thirdMax(int[] nums) {
        int min = nums[0];
        for(int n : nums) min = Math.min(min,n);
        int max = nums[0];
        int sec = min;
        int thr = min;
        boolean b = false;
        for(int i = 0;i < nums.length;i++) {
            if(max<nums[i]) {
                thr = sec;
                sec = max;
                max = nums[i];
            } else if((nums[i] > sec) && (max > nums[i])) {
                thr = sec;
                sec = nums[i];
            } else if((nums[i] > thr) && (max > nums[i]) && (sec > nums[i])) {
                thr = nums[i];
            }
        }
        if(nums.length == 2 || sec == thr) return max;
        else return thr;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,65,7,7,8,9,0};
        System.out.println(thirdMax(arr));

    }
}