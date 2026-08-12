package Arrays.Leetcode;

public class lc1295 {
    public static void main(String[] args) {
        int[] arr={1,22,333,4444};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int number=0;
        for(int num: nums){
            double count=(double)(Math.log10(num))+1; //this line will find the digits of a no
            if(count%2==0) number++;
        }
        return number;
    }
}
