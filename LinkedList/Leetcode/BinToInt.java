class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = next;
    }
}

public class BinToInt{
    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);

        display(head);
        System.out.println();
        System.out.println(convert(head));
    }

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int convert(Node head){
        Node temp = head;
        int sum = 0;
        while (temp != null){
            sum =  sum * 2;
            sum  = sum + temp.data;
            temp = temp.next;
        }
        return sum;
    }
}