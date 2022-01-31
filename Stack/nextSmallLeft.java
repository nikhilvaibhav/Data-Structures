import java.util.*;

public class nextSmallLeft{
    public static void main(String[] args){
        int arr[] = {1,3,2,4,7};
        System.out.println(small(arr));

    }
    
    static ArrayList<Integer> small(int arr[]){
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                result.add(-1);
            }
            else if(!stack.isEmpty() && stack.peek() < arr[i]){
                result.add(stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i]){
                while(!stack.isEmpty() && stack.peek() >= arr[i]){
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
        return result;
    }
}