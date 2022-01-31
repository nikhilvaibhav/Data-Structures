import java.util.Stack;
class solution{
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> ss = new Stack<Integer>();

    public void push(int x){
        s.push(x);
        if(ss.size() == 0 || x <= ss.peek()){
            ss.push(x);
        }
    }

    public int pop(){
        if(s.size() == 0) return -1;
        int del = s.pop();
        if(del == ss.peek()){
            ss.pop();
        }
        return del;
    }

    public int min(){
        return ss.peek();
    }
}

public class minimumStack{
    public static void main(String [] args){
        solution sol = new solution();
        sol.push(10);
        sol.push(20);
        sol.push(45);
        sol.push(2);
        sol.push(23);
        sol.pop();
        sol.pop();
        System.out.println(sol.min());
    }
}