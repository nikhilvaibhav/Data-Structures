public class immediateSmall{
    static int small(int arr[], int element){
        int min = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min < arr[i] && arr[i] < element){
                min = arr[i];
            }
        }
        if(min != Integer.MIN_VALUE){
            return min;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,2,16,15,17,3};
        int element = 1;
        System.out.print(small(arr, element));
    }
}