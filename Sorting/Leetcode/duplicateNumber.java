//Leetcode 287
//FAANG Interview Question
import java.util.Arrays;
public class duplicateNumber{
    public static void main(String[] args) {
        int arr[] = {3,1,3,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != i + 1){
                return arr[i];
            }
        }
        return -1;
    }

    static void sort(int arr[]){ 
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
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