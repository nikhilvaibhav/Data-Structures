import java.util.*;

public class MultipleLinearSearch{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4};
        int n = arr.length;
        int target = 4;
        System.out.print(search(arr, n, target, new ArrayList<>()));
        
    }
    
    
    static ArrayList<Integer> search(int[] arr, int n, int target, ArrayList<Integer> list) {

        if (n == 0) {
            return list;
        }

        if(arr[n - 1] == target) {
            list.add(n - 1);
        }

        return search(arr, n - 1, target, list);
    }
}