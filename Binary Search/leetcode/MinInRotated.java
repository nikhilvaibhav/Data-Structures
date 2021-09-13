public class MinInRotated{
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.print(find(arr));
    }

    static int find(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;

        while(start <= end){
            int mid = start + (end - start)/2;
            int prev = (mid + n - 1)%n;
            int next = (mid + 1) % n;
            
            if(arr[prev] > arr[mid] && arr[mid] < arr[next]){
                return arr[mid];
            }
            
            if(arr[start] < arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start];
    }    
}