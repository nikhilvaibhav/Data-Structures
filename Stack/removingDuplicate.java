import java.util.*;

public class removingDuplicate{
    public static void main(String [] args){
        String str = "abbaca";
        // output --> ca
        System.out.println(remove(str));
    }

    static String remove(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(!stack.isEmpty() && stack.peek() == str.charAt(i)){
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}