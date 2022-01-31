import java.util.Stack;

public class balancedParenthesis{
    public static void main(String[] args){
        String par = ")(){})";

        System.out.println(isBalanced(par));
    }

    static boolean isBalanced(String par){
        if(par.length()%2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char ch : par.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }
            else if(ch == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }
            else if(ch == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}