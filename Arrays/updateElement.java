public class updateElement{
    static int updated(int arr[], int n, int index, int element){
        int i=0;
        for(; i<n; i++){
            if(i==index){
                arr[i] = element;
                break;
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int n = arr.length;
        int index = 2;
        int element = 23;
        System.out.print(updated(arr, n, index, element));
    }
}