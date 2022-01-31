import java.util.*;

public class nextGreaterElement{
    public static void main(String[] args){
        int arr1[] = {4,1,2};
        int arr2[] = {1,3,4,2};
        for(int num : nextGreat(arr1, arr2)){
            System.out.print(num + " ");
        }
    }
    static int[] nextGreat(int arr1[], int arr2[]){
        HashMap<Integer, Integer> get_element = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(Integer num : arr2){
            while(!stack.isEmpty() && stack.peek() < num){
                get_element.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int i=0; i<arr1.length; i++){
            arr1[i] = get_element.getOrDefault(arr1[i], -1);
        }
        return arr1;
    }

    static int[] element(int arr1[], int arr2[]){
        int res[] = new int[arr1.length];
        for(int i=0;i <arr1.length;i++){
            res[i]=Integer.MAX_VALUE;
            for(int j=1; j<arr2.length; j++){
                if(arr1[i] == arr2[j-1] && arr1[i] < arr2[j]){
                    res[i] = arr2[j];
                }
                
            }
            if(res[i] == Integer.MAX_VALUE){
                res[i] = -1;
            }
        }
        return res;
    }
}