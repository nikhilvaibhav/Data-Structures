public class ceilOfnum{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,6,7,8,11, 13, 14};
        int target = 12;
        int ans = ceilOfnum(arr, target);
        System.out.print(ans);
    }

    static int ceilOfnum(int[] arr, int target) {
        int res = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }
            else{
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else{
                    res = arr[mid];
                    end = mid - 1;
                }
            }
        }
        return res;
    }
}