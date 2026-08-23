package Arrays.Leetcode;

public class lc1491 {

    public static void main(String[] args) {

        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));

    }

    static double average(int[] salary) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int s=0;
        int n=salary.length;


        for(int i=0; i<n; i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
            s+=salary[i];
        }

        s=s-min-max;


        double avg=(double) (s)/(n-2);
        return avg;
    }
}
