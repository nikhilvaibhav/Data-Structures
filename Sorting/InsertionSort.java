import java.util.Arrays;
public class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3};
        Isort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Isort(int arr[]){
        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}