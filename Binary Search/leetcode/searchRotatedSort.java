public class searchRotatedSort{
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int min = findMin(arr);
        System.out.print(search(arr, min, target));
    }

    static int search(int arr[], int min, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            if(arr[min] == target){
                return min;
            }
            if(target > arr[min] && target < arr[start]){
                start = min + 1;
            }
            else{
                end = min - 1;
            }
        }
        return -1;
    }

    static int findMin(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;

        while (start <= end){
            int mid = start + (end - start)/2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1)%n;
                if(arr[mid] < arr[next] && arr[mid] < arr[prev]){
                    return mid;
                }
                if(arr[mid] > arr[start] && arr[mid] > arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid;
                }
        }
        return start;
    }
}