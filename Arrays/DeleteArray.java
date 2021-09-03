import java.util.Scanner;
public class DeleteArray{
    static int[] delete(int arr[], int x){
        int brr[] = new int[arr.length-1];
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=x){
                brr[k]=arr[i];
                k++;
            }
            else{
                continue;
            }
        }
        return brr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,2,3,4};
        System.out.print("enter the number to be deleted..");
        int x = sc.nextInt();
        int res[] = delete(arr, x);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}