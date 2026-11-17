package Logical_problems;

import java.util.HashMap;

public class FirstRepeating {
    public static int repeatingFirst(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        for(int n : arr) if(map.get(n) > 1) return n;
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(repeatingFirst(arr));;
    }
}
