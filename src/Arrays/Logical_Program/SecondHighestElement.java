package Arrays.Logical_Program;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            // If current number is greater than the highest
            if (num > highest) {
                secondHighest = highest; // Old highest becomes second highest
                highest = num;           // Update highest
            }
            // If current number is between highest and second highest
            else if (num > secondHighest && num != highest) {
                secondHighest = num;     // Update second highest
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number.");
        } else {
            System.out.println("The second highest number is: " + secondHighest);
        }
    }
}