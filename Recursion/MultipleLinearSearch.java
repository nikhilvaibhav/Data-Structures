import java.util.*;

public class MultipleLinearSearch{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4};
        int n = arr.length;
        int target = 4;
        search(arr, n, target);
        Collections.reverse(list);
        System.out.println(list);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    
    static void search(int[] arr, int n, int target) {

        if (n == 0) {
            return;
        }

        if(arr[n - 1] == target) {
            list.add(n - 1);
        }

        search(arr, n - 1, target);
    }
}