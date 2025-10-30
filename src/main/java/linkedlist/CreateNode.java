package linkedlist;


public class CreateNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(30);
        Node d = new Node(40);

        head.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(null);

        while (head!= null) {
            System.out.println(head.getVal());
            head = head.getNext();
        }
    }
}
