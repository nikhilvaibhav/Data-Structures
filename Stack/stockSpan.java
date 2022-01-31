import java.util.*;


public class stockSpan{
    public static void main(String[] args){
        int arr[] = {100,20,40,80,300};
                    

        System.out.print(small(arr));
    }

    static ArrayList<Integer> small(int arr[]){

        ArrayList<Integer> result = new ArrayList<>();
        Stack< Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                result.add(1);
            }
            else if(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                result.add(1);
            }
            else if(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    result.add(i+1);
                }
                else{
                    result.add(i - stack.peek());
                }
            }

            stack.push(i);
        }

        return result;
    }
}