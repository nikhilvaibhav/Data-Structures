public class orderAgnos{
    public static void main(String[] args) {
        int arr[] = {40, 35, 32, 31, 30, 0, -10, -45};
        int target = 31;
        int res = agnos(arr, target);
        System.out.println(res);
    }

    static int agnos(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        

        if(arr[start] < arr[end]) {
            while(start <= end) {
                
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else if(target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }

        else{
            while(start <= end) {
                
                if(target > arr[mid]) {
                    end = mid - 1; 
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
        }

        return -1;
    }
}