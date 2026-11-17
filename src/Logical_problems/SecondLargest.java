package Logical_problems;

public class SecondLargest {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,778,89,90,7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int n : arr) {
            if(n > largest) {
                secondLargest = largest;
                largest = n;
            } else if(n > secondLargest) secondLargest = n;
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
