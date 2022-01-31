import java.util.*;

public class maxAreaHistogram{
    public static void main(String[] args){
        int arr[] = {2,1,5,6,2,3};
        ArrayList<Integer>res1 =  right(arr);
        ArrayList<Integer>res2 = left(arr);
        ArrayList<Integer>res = width(res1,res2);
        System.out.println("The maximum area is " + area(arr, res));
        
    }

    static ArrayList<Integer> right(int arr[]){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        int pseudoInd = arr.length;
        for(int i = arr.length - 1; i >= 0; i--){
            if(stack.isEmpty()){
                res.add(pseudoInd);
            }
            else if(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                res.add(stack.peek());
            }
            else if(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    res.add(pseudoInd);
                }
                else{
                    res.add(stack.peek());
                }
            }

            stack.push(i);
        }
        Collections.reverse(res);
        return res;
    }

    static ArrayList<Integer> left(int arr[]){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int pseudoInd = -1;

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                res.add(pseudoInd);
            }
            else if(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                res.add(stack.peek());
            }
            else if(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                    stack.pop();
                }
                
                if(stack.isEmpty()){ 
                    res.add(pseudoInd);
                }
                else{
                    res.add(stack.peek());
                }
            }

            stack.push(i);
        }
        return res;
    }
    
    static ArrayList<Integer> width(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.size() && j<arr2.size()) {
            res.add(arr1.get(i) - arr2.get(j) - 1);
            i++;
            j++;
        }

        return res;
    }

    static int area(int arr[], ArrayList<Integer> width){
        ArrayList<Integer> res = new ArrayList<Integer>();
        int maxArea = 0;

        int i=0,j=0;

        while(i<arr.length && j<width.size()){
            res.add(arr[i] * width.get(j));
            i++;
            j++;
        }

        for(i=0; i<res.size(); i++){
            if(res.get(i) > maxArea){
                maxArea = res.get(i);
            }
        }
        return maxArea;
    }
}