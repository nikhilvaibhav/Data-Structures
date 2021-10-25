public class recap{
    public static void main(String[] args){
        int arr[] = {1,0,56,78};
        int n = arr.length;
        if(check(arr, n)){
            System.out.println("sorted hai bhai");
        }
        else{
            System.out.println("sorted nahi hai");
        }
    }

    static boolean check(int arr[], int n){

        if(n == 0 || n == 1){return true;}
        if (arr[n-1] < arr[n-2]){
            return false;
        }

        return check(arr, n-1);
    }
}