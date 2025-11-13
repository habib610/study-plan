package linkedlist;

public class ReverseOfLinkList {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);


        Node head1 = list.getHead();
        while (head1 != null) {
            System.out.println(head1.val);
            head1 = head1.next;
        }


        Node head = list.getHead();
//      10 -> 20  30 -> 40
//      p     c     n
//
        Node previous = head;
        Node current = head.next;
        previous.next = null;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        System.out.println("ended");
        System.out.println(current);
        Node finalHead = previous;
        while (finalHead != null) {
            System.out.println(finalHead.val);
            finalHead = finalHead.next;
        }

    }
}
