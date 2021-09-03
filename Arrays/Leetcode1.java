import java.util.Scanner;
public class Leetcode1{
    static int[] sum(int arr[]){
        // solution in O(n ^ 2)

        // int res[] = new int[arr.length];
        // for(int i=0 ;i<arr.length; i++){
        //     int temp = 0;
        //     for(int j=0; j<=i; j++){
        //         temp = temp + arr[j];
        //     }
        //     res[i] = temp;
        // }

        //solution in O(n)
        for(int i=1;i<arr.length;i++)
    {
        arr[i]+=arr[i-1];
    }
        return arr; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,1,1};
        int res[] = sum(arr); 
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        
    }
}