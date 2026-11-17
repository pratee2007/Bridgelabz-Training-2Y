package Logical_problems;

public class TwoSumSortedArray {
    public static int[] twoSum(int[] arr,int target) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum > target) j--;
            else if(sum < target) i++;
            else return new int[] {i,j};
        }
        return new int[] {-1,-1};
    }

    static void main(String[] args) {
        int[] arr = {2,7,11,13};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
