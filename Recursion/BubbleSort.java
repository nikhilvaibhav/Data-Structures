import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int n = arr.length - 1;
        sort(arr, n, 0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int arr[], int n, int c){
        if(n == 0) return arr;
        if(c<n){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            return sort(arr, n, c+1);
        }
        else{
            return sort(arr,n - 1, 0);
        }
    }
}