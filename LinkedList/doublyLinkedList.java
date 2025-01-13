package LinkedList;

public class doublyLinkedList {
    Node head;

    public class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // add first
    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (head.next == null) {
            newNode.next = null;
            head.next = newNode.prev;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        newNode.prev = currentNode;
        currentNode.next = newNode;

    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print((currentNode.prev != null ? currentNode.prev.data : "null") +
                    " <- " + currentNode.data + " -> " +
                    (currentNode.next != null ? currentNode.next.data : "null") + "   \t");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.addfirst(55);
        list.addfirst(3);
        list.addLast(44);
        list.printList();
    }
}
