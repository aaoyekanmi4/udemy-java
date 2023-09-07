package LinkedLists;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            node = tail;
        } else {
            Node current = head;
            int index = 0;
            while (index < location -1) {
                current = current.next;
                index++;
            }
            Node nextNode = current.next;
            current.next = node;
            node.next = nextNode;
        }
        size++;
    }
}
