public class checkSorted{
    public static void main(String[] args) {
        int arr[] = {23, 34, 36, 47, 56};
        int n = arr.length;
        if(check(arr,n) == 1){
            System.out.println("sorted hai bhai");
        }
        else{
            System.out.println("sorted nahi hai bhai");
        }
    }

    static int check(int arr[], int n){
        if(n == 0 || n == 1){return 1;}
        
        if(arr[n-1] < arr[n-2]){
            return 0;
        }
        return check(arr, n-1);
    }
}