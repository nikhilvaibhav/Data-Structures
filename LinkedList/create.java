class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class create{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(60);

        printList(head);
        System.out.println( " ");
        System.out.print(count(head));
        System.out.println(" ");

        rprint(head);
        System.out.println(" ");
        System.out.println(search(head, 30));

    }

    //traversal of linkedlist 
    static void printList(Node head){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
    }

    //count number of nodes

    static int count(Node head){
        Node temp = head;
        int tot = 0;
        while(temp != null){
            tot+=1;
            temp = temp.next;
        }
        return tot;
    }

    //recursively traversing the linked list

    static void rprint(Node head){
        if (head == null)
            return;
        System.out.print(head.data + " ");
        rprint(head.next);
    }

    //iteratively search for any given element

    static int search(Node head, int element){
       int pos = 1;
       Node temp = head;
       while(temp != null){
           if(temp.data == element){
               return pos;
           }
           else{
               pos++;
               temp = temp.next;
           }
       }
       return -1;
    }
}