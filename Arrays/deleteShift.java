public class deleteShift{
    static void shifted(int arr[],int n, int index){

        //solution for geeks for geeks
        for(int i=index ; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;   
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int n = arr.length;
        int index = 11;
        shifted(arr, n,index);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}