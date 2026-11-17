package Logical_problems;

public class ReverseArray {
    public static void display(int[] arr) {
        for(int i = 0;i < arr.length;i++) System.out.print(arr[i] + " ");
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("original");
        display(arr);
        System.out.println("\nafter reverse");
        reverse(arr);
        display(arr);
    }
}
