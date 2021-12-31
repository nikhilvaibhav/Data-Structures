class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class sortedLinkedList{
    public static void main(String[] args){
        Node head = new Node(50);
        head.next = new Node(40);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        display(head);
        sorted(head);
        System.out.println();
        display(head);
    }

    // TO DISPLAY THE LINKDED LIST
    static void display(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    //TO SORT THE LINKED LIST
    static void sorted(Node head){
        Node simp = head;
        while(simp.next != null){
            Node pimp = simp.next;
            while(pimp != null){
                if(simp.data > pimp.data){
                    int bump = simp.data;
                    simp.data = pimp.data;
                    pimp.data = bump;
                }
                pimp = pimp.next;
            }
            simp = simp.next;
        }
    }
}