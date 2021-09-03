public class rotateArray{
    static int[] rotate(int arr[]){
        

        //space complexity -> O(1)
        //time complexity -> O(n)
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotate(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}