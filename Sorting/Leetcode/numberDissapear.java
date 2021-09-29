// Google Interview Question.
//Easy level Leetcode 448
import java.util.*;
public class numberDissapear{
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        List res = dissapear(arr);
        System.out.println(res);
        
    }
    
    static List<Integer> dissapear(int arr[]){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                res.add(arr[i]);
            }
        }
        return res;
    }

    static void sort(int[] arr){
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