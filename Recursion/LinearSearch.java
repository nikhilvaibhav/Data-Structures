public class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {34,32,78,10};
        int n = arr.length;
        int target = 32;
        System.out.print(search(arr, n, target));
    }

    static int search(int[] arr, int n, int target){
        if(n == 0){
            return -1;
        }
        if (arr[n-1] == target){
            return n-1;
        }

        return search(arr, n-1, target);
    }
}