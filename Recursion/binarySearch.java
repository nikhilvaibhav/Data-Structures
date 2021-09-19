public class binarySearch{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int target = 10;
        int start = 0;
        int end = arr.length - 1;

        int res = bsearch(arr, target, start, end);
        System.out.print(res);
    }

    static int bsearch(int arr[], int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else{
            if(arr[mid] > target){
                return bsearch(arr, target, start, mid - 1);
            }
            else{
                return bsearch(arr, target, mid + 1, end);
            }
        }
    }
}