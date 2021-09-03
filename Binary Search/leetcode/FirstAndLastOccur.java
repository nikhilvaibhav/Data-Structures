// This question was asked in facebook 
// medium level question
import java.util.*;
public class FirstAndLastOccur{
    public static void main(String[] args) {
        int arr[] = {5,7,7,7,7,8,8,10};
        int target = 7;
        int res[] = result(arr, target);
        System.out.print(Arrays.toString(res));  
    }

    static int[] result(int arr[], int target){
        int res[] = {-1, -1};
        int first = search(arr, target, true);
        int last = search(arr, target, false);
        res[0] = first;
        res[1] = last;
        return res;
        
    }

    static int search(int arr[], int target, boolean findFirst){
        int start = 0;
        int end  = arr.length - 1;
        int ans = -1;
        

        while(start <= end){
            int mid = start + ( end - start )/2;
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(findFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

    
}