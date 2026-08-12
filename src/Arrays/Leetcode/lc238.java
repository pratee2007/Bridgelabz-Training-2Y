package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class lc238 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter your array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        int[] right = new int[n];
        right[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}