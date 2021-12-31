class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Rotate{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        display(head);
        Node res = rotate(head, 6);
        System.out.println();
        display(res);

    }
    
    //By first making it a linked list
    static Node rotate(Node head, int k){
        
        
        int count = 1;
        Node temp = head;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }

        
        System.out.println();
        System.out.print(count);

        temp.next = head;
        head = temp;

        for(int i=0; i< count - k % count; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
        
    }

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;

        while (head != null){
            Node next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}