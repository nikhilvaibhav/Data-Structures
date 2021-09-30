import java.util.*;
import java.util.Arrays;

public class duplicate{
    public static void main(String[] args) {
        int arr[] = {1, 1};
        sorted(arr);
        System.out.println(Arrays.toString(arr));
        List res = copy(arr);
        System.out.println(res);
    }

    static List<Integer> copy(int arr[]){
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i + 1){
                res.add(arr[i]);
            }
        }
        return res;
    }

    static void sorted(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }
}