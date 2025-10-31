package linkedlist;

public class LinkList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void addLast(T value) {
        Node<T> node = new Node<>(value);
        if(head == null){
            head = tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }
    public Node<T> getHead(){
        return head;
    }

    public void getHead(T val){
       Node<T> node = new Node<>(val);
       if(head == null){
           head = tail = node;
       }   else {
           tail.next = node;
           tail = node;
       }
    }
}
