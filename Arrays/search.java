import java.util.Scanner;
public class search{
    static int sear(int arr[], int n, int ele){
        for(int i=0; i<n; i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,34,11,6,4};
        int n = arr.length;
        System.out.println("Enter the element to be searched ");
        int ele = sc.nextInt();
        int res = sear(arr, n, ele);
        if (res == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at " + res);

        }
    }
}
