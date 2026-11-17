package Recursion;

import java.util.*;

public class CombSum {
    public static void csum(int[] arr, List<Integer> list,int i,int sum,int target) {
        if(i == arr.length) {
            if(sum == target) System.out.println(list + " ");
            return;
        }
        if(sum == target) System.out.println(list + " ");
        else if(sum > target) return;
        else {
            list.add(arr[i]);
            sum += arr[i];
            csum(arr,list,i,sum,target);
            list.removeLast();
            sum -= arr[i];
            csum(arr,list,i+1,sum,target);
        }
    }

    static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<Integer> list = new ArrayList<>();
        csum(arr,list,0,0,target);
    }
}
