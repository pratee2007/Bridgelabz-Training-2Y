package Recursion;

import java.util.*;
public class Subsequence2 {
    public static void sub(int i,int[] arr,int n,List<Integer> list,int sum,int target,int ct) {
        if(i >= n) {
            if(ct > 0) return;
            if(target == sum) {
                System.out.println(list + " ");
            }
            return;
        }
        list.add(arr[i]);
        sum += arr[i];
        sub(i+1,arr,n,list,sum,target,ct);
        list.removeLast();
        sum -= arr[i];
        sub(i+1,arr,n,list,sum,target,ct);
    }

    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {2,1,1};
        int target = 2;
        sub(0,arr,arr.length,list,0,target,0);
    }
}
