package Recursion;

import java.util.*;

public class SubsetSum {
    public static void iter(int i) {
        i = i + 1;
    }
    public static void sub(int[] arr,int i,int sum,List<Integer> set) {

        if(i == arr.length) {
            set.add(sum);
            return;
        }
        sub(arr,i+1,sum + arr[i],set);
        sub(arr,i+1,sum,set);
    }

    static void main(String[] args) {
        int[] arr = {2,3};
        List<Integer> set = new ArrayList<>();
        sub(arr,0,0,set);
        System.out.println(set);
    }
}
