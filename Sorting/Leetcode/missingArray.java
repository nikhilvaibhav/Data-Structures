// Amazon interview question
import java.util.Arrays;
public class missingArray{
    public static void main(String[] args) {
        int arr[] = {0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("The missing number is " + search(arr));
    }

    static int search(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i){
                return i;
            }
            i++;
        }
        return arr.length;
    }

    static void sort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] >= arr.length){
                i++;
            }
            else if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }    
    }

    static void swap(int arr[], int i, int correctIndex){
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }
}