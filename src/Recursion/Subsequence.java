package Recursion;

import java.util.*;
public class Subsequence {
    public static void sub(int i,int[] arr,int n,List<Integer> list) {
        if(i >= n) {
            System.out.println(list + " ");
            return;
        }
        list.add(arr[i]);
        sub(i+1,arr,n,list);
        list.removeLast();
        sub(i+1,arr,n,list);
    }

    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {3,1,2};
        sub(0,arr,arr.length,list);
    }
}
