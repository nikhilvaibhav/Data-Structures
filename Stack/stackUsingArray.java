class stack{
    int arr[];
    int top;
    int capacity;

    public stack(int n){
        this.top = -1;
        this.capacity = n;
        this.arr = new int[capacity];
    }

    public void push(int x){
        top += 1;
        arr[top] = x;
    }
    public int pop(){
        int del = arr[top];
        top -= 1;

        return del;        
    }
    public int peek(){
        return arr[top];
    }
    public int size(){
        return top+1;
    }
}

public class stackUsingArray{
    public static void main(String[] args){
        stack st = new stack(5);
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());

    }
}









