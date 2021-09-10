public class peakIndex{
    public static void main(String[] args) {
        int arr[] = {0,1,2,10,5,2,1};
        System.out.print(peak(arr));
    }
    static int peak(int arr[]){
        int start = 1;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
                return mid;
            }
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}