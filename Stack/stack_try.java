class Stack{
    int arr[];
    int capacity;
    int top;

    public Stack(int n){
        this.top = -1;
        this.capacity = n;
        this.arr = new int[n];
    }
    public void push(int number){
        top += 1;
        arr[top] = number;

    }
    public int pop(){
        int removed = arr[top];

        top -= 1;
        return removed;
    }
    public int peek(){
        return arr[top];
    }
    public int size() {
        return top+1;
    }
    
}

public class stack_try{
    public static void main(String[] args){
        Stack st = new Stack(5);
        st.push(5);
        st.push(6);

        st.pop();
        st.push(7);
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}