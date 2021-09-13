public class peakIndex{
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,1,0};
        System.out.print(find(arr));
    }

    static int find(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;

            while(start < end){
                int mid = start + (end - start)/2;
                if(arr[mid] < arr[mid + 1]){
                    start = mid + 1;
                }
                else{
                    end = mid;
                }
            }
            return start;
    }
    
}

