public class floorOfNum{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7, 9, 10};
        int target = 8;
        int res = floorOfNum(arr, target);
        System.out.print(res);
    }

    static int floorOfNum(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int res = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else{
                if(arr[mid]<target){
                    res = arr[mid];
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return res;
    }
}