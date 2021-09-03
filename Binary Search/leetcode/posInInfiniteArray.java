// FAANG level 
// asked in facebook ----> Medium level problem

public class posInInfiniteArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target = 7;
        int res = position(arr, target);
        System.out.print(res);
    }

    static int position(int arr[], int target){
        int start = 0;
        int end = 1;

        if(target > arr[end]){
            while(arr[end] < target){
                start = end;
                end = 2 * end;
            }
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}
