package Logical_problems;

public class Swap {
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        display(arr);
    }
    public static void display(int[] arr) {
        for(int i = 0;i < arr.length;i++) System.out.print(arr[i] + " ");
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        swap(arr,0,4);
    }
}
