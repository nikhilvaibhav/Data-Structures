import java.util.*;

public class twoSum{
    public static void main(String[] args){
        int arr[] = {3,2,4};
        int target = 6;
        int res[] = sol2(arr, target);
        for(int num:res){
            System.out.print(num + " ");
        }
    }

    //Brute force of O(n^2) time complexity
    static int[] sol(int[] arr, int target){
        int res[] = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    res[0] = i; res[1] = j;
                }
            }
        }
        return res;
    }

    //better solution  - > )(n. logn) using sorting.

    // better solution using library function. O(n) time as well as space complexity
    static int[] sol3(int arr[], int target){
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(res.containsKey(complement)){
                return new int[] {res.get(complement), i};
            }
            else{
                res.put(arr[i], i);
            }
        }
        return new int[] {-1,-1};
    }
                
}

   
    