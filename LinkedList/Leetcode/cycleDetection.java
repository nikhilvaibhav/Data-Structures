// Leetcode Easy problem

import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class cycleDetection{
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next = new Node(50);

        //head.next.next.next.next = head;

        System.out.print(loopDetected(head));
    }

    static void display(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Approach 2 -> better solution and optimised -- > floyd detection ---> O(n)
    static boolean loopDetected(Node head){
        if(head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;

        }

        return false;
    }

    //Approach 1 -> brute force --> space and time complexity would be O(N) --> Using hashSet collection
    static boolean cycle(Node head){
        HashSet<Node> temp = new HashSet<>();

        while (head != null){
            if(temp.contains(head)){
                return true;
            }

            temp.add(head);
            head = head.next;
        }

        return false;
    }
}