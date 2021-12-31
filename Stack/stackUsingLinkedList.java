class Node{
    int data;
    Node next;
  

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class stackUsingLinkedList{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        display(head);
        push(head, 10);
        System.out.println();
        display(head);
        System.out.println();
        System.out.print(size(head));
    }

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void push(Node head,int num){
        Node new_node = new Node(num);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
        temp = temp.next;
    }
    static int pop(Node head){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int deleted = temp.next.data;
        temp.next = null;

        return deleted;
    }
    static int peek(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }
    static int size(Node head){
        Node temp = head;
        int count = 1;
        while(temp.next != null){
            temp = temp.next;
            count +=1;
        }
        return count;
    }
}