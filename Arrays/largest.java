import java.io.*;
import java.util.*;
public class largest{
    static int large(int arr[]){
        //method 1

        // int temp = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(temp < arr[i]){
        //         temp = arr[i];
        //     }
        // }
        // return temp;

        //method 2 using collection
        
            Arrays.sort(arr);
            return arr[arr.length-1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {1,2,3,1};
        System.out.print(large(arr));
    }
}