public class indexElement{
    static int element(int arr[], int n, int i){
        int j=0;
        for(; j<n; j++){
            if(j==i){
                break;
            }
        }
        return arr[j];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int i=3;
        System.out.print(element(arr, n, i));
    }
}