import java.util.Scanner;
public class insertAtPos{
    static int [] insert(int arr[], int n, int pos, int number){
        int brr[] = new int[arr.length + 1];
        for(int i=0; i<n+1; i++){
            if(i<pos-1){
                brr[i] = arr[i];
            }
            else if (i==pos-1){
                brr[i]=number;
            }
            else{
                brr[i] = arr[i-1];
            }
        }
        return brr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int pos = 2;
        int number = 2;
        int res[] = insert(arr, n, pos, number);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}