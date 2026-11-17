package Logical_problems;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void removeDuplicate(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        for(int n : map.keySet()) if(map.get(n) == 1) System.out.print(n + " ");
    }
    public static void display(int arr[]) {
        for(int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,8};
        System.out.println("Before: ");

        display(arr);
        System.out.println("After: ");
        removeDuplicate(arr);
    }
}
