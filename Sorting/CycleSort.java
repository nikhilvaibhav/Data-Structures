import java.util.Arrays;
public class CycleSort{
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        int i = 0;
        while(i < arr.length) {
            int correctInd = arr[i] - 1;
            if(arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctInd) {
        int temp = arr[correctInd];
        arr[correctInd] = arr[i];
        arr[i] = temp;

    }
}