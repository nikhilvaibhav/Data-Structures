public class BinaryRecap{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int element = 70;
        System.out.print(search(arr, element));

    }

    static int search(int arr[], int element) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == element){
                return mid;
            }

            if(arr[mid] > element){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}