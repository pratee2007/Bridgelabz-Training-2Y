package Arrays.Sliding_window;

public class overview {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;
        window( arr, k);
    }
    private static void window(int[] arr, int k){
        int sum=0;
        int n=arr.length;
        for(int i=0; i<k; i++) sum +=arr[i];
        System.out.println(sum);

        int i=0 , j=k-1;
        while(j<n-1){
            sum = sum + arr[++j] - arr[i++];
            System.out.println(sum);
        }
   }
}
