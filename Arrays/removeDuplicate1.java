public class removeDuplicate1{
    // space complexity  - O(1)
    //time complexity - O(n)
    static int remove(int arr[], int n){
        int j=0;
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j] = arr[n-1];
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5,5};
        int n = arr.length;
        int r = remove(arr,n);
        for(int i=0; i<=r; i++){
                System.out.print(arr[i] + " ");
            
        }
    }
}