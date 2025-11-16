package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PalindromeOfLinkList {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<>();
        List<Integer> list = new ArrayList<>();

        linkList.addLast(10);
        linkList.addLast(20);
        linkList.addLast(30);
        linkList.addLast(40);

        Node head1 = linkList.getHead();
        Node head3 = linkList.getHead();
        Node head = linkList.getHead();

//        10 -> 20 -> 30 -> NULL         NULL <-  10 <- 20 <- 30
//        p -> c -> n


        while(head3 != null){
            list.add(Integer.valueOf(head3.val.toString()));
            head3 = head3.next;
        }

        Node current = head.next;
        Node previous = head;

        previous.next  = null;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        System.out.println("Printing list");

       for (Integer val : list){
           System.out.println(val);
       }

       System.out.println("Reversed list");
       int i = 0;

       while (previous != null){
           System.out.print(previous.val);
           System.out.println(list.get(i));
           if(list.get(i) != previous.val)      {
               System.out.println("Not palindrome");
               break;
           }
           previous = previous.next;
           i++;
       }
        System.out.println("Finished");

    }
}
