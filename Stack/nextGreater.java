import java.util.*;

public class nextGreater{
    public static void main(String[] args){
        int arr[] = {1,3,2,4};
        System.out.println(great(arr));
    }

    public static ArrayList<Integer> great(int arr[]){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            if(stack.isEmpty()){
                result.add(-1);
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i]){
                result.add(stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek() < arr[i]){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result.add(-1);
                }
                else{
                    result.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}