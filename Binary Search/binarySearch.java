public class binarySearch{
    public static void main(String[] args) {
        int arr[] = {-10,-20,0,1,2,3,4,5,6,7,8,9};
        int target = 6;
        int res = binary(arr, target);
        System.out.println(res);
    }


    static int binary(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = arr[mid] + 1;
            }
            else if (target > arr[mid]){
                start = arr[mid] + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}