package LinkedList;

public class BasicLinkedList {
    static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        System.out.print(a.data + " -> ");
        System.out.print(a.next.data + " -> ");
        System.out.print(a.next.next.data + " -> ");
        System.out.print(a.next.next.next);

    }
}
