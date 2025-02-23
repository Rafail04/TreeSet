package SingleLinkedlist;
public class LinkedListExamples {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " \n");
            n = n.next;
        }
    }


    public static void main(String[] args) {

        LinkedListExamples list = new LinkedListExamples();

        list.head = new Node(243);
        Node second = new Node(412);
        Node third = new Node(454);

        list.head.next = second;
        second.next = third;
        list.display();

    }
}



