import java.util.Arrays;

public class SelectionSort{
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        sort(arr,arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int i, int j) {
        if(j<i){
            int put = arr.length - 1 - j;
            int max = maximum(arr, 0, put);
            int temp = arr[put];
            arr[put] = arr[max];
            arr[max] = temp;
        }
    }

    static void maximum(int arr[], int i, int put){
        for()
    }
}