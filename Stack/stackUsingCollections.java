import java.util.Stack;

public class stackUsingCollections{
    public static void main(String[] args){
        Stack<Integer> res = new Stack<Integer>();
        res.push(10);
        res.push(20);
        res.push(30);
        System.out.println(res);
        System.out.println(res.peek());
        //System.out.println(res.pop());
        System.out.println(res.size());

        System.out.println(res.indexOf(20));
        System.out.println(res.isEmpty());
    }
}