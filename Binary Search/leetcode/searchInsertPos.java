//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, 
//return the index where it would be if it were inserted in order.

//You must write an algorithm with O(log n) runtime complexity.

class searchInsertPos {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int target = 4;
        int res = searchInsert(arr, target);
        System.out.print(res);
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = 0;
        if(nums[end] < target){
            return end + 1;
        }
        else if(nums[start] > target){
            return start;
        }
        else{
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else{
                if(nums[mid] < target){
                    start = mid + 1;
                }
                else{
                    res = mid;
                    end = mid - 1;
                }
            }
        }
        return res;
}
    }
}
