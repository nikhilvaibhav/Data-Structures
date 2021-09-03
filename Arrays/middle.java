class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class middle{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printList(head);
        System.out.println();
        goodSolution(head);

    }

    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void solution(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        Node curr = head;
        for(int i=0; i<count/2; i++){
            curr = curr.next;
        }
        System.out.print(curr.data);
    }
    
    static void goodSolution(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }

}