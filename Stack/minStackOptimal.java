import java.util.Stack;

class solution{
    Stack<Integer> s = new Stack<Integer>();
    int res = Integer.MAX_VALUE;
    
    public void push(int x){
        s.push(x);
        if(x <= res){
            res = x;
        }
    }
    public int pop(){
        if(s.size() == 0){
            return -1;
        }
        
    }
}


public class minStackOptimal{
    public static void main(String[] args){

    }
}