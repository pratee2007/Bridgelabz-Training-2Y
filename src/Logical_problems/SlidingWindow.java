package Logical_problems;

public class SlidingWindow {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            sum += arr[i];
            if (i >= k) sum -= arr[i - k];
            if(i >= k - 1) System.out.println(sum);
        }
    }
}
