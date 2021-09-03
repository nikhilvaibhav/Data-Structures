public class immediateLarge{
    static int large(int arr[], int element){
        int max = Integer.MAX_VALUE; // initialising with some max value so that we can start comparing.
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max && arr[i] > element){
                max = arr[i];
            }
        }
        if(max != Integer.MAX_VALUE){
            return max;
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,11,0,12,19};
        int element = 11;
        System.out.print(large(arr, element));
    }
}