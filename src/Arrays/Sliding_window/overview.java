package Arrays.Sliding_window;

public class overview {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;
        window(arr,k);

    }
    public static void window(int[] arr, int k){
        int sum=0;
        for(int i=0; i<k; i++) sum +=arr[i];
        System.out.println("first window "+ sum);

        int i=0;
        int j=k-1;
        int n=arr.length;
        while(j<n){
            sum -= arr[i];
            i++;
            j++;
            if(j<n) sum += arr[j];
            System.out.println(sum);
        }
    }
}
