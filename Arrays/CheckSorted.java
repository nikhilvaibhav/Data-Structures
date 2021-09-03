import java.util.Scanner;

public class CheckSorted{
    static boolean check(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int temp=arr[i];
            if(temp > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,5,6,7};
        System.out.print(check(arr));
    }
}