public class sorted{
    static int check(int arr[], int n){
        for(int i=1 ; i<n-1; i++){
            int temp = arr[i-1];
            if(!(temp < arr[i] && arr[i] < arr[i+1]) && !(temp > arr[i] && arr[i] > arr[i+1])){
                return 0;
            } 
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.print(check(arr, n));

    }
}