package linkedlist;

public class MiddleOfLinkList {
    public static void main(String[] args) {
        LinkList<Integer> node = new LinkList<>();
        node.addLast(10);
        node.addLast(20);
        node.addLast(30);
        node.addLast(40);
        node.addLast(50);


        System.out.println(middleNode(node.getHead()).val);
    }

    public static Node middleNode(Node head) {
        int size = 0;
        Node temp1 = head;
        Node temp2 = head;
        while(temp1 != null) {
            size++;
            temp1 = temp1.next;
        }
        int middle = size/2;
        int i = 0;
        while(i < middle) {
            i++;
            temp2 = temp2.next;
        }
        return temp2;

    }
}
