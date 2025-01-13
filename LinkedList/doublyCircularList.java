package LinkedList;

public class doublyCircularList {
    Node head;

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }
        Node tail = head.prev; // Get the last node (tail)

        newNode.next = head; // Link newNode to the old head
        newNode.prev = tail; // Link newNode to the tail
        tail.next = newNode; // Update tail's next to new head
        head.prev = newNode; // Update old head's prev to newNode
        head = newNode; // Update head to newNode
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }
        Node tail = head.prev; // Get the last node (tail)

        tail.next = newNode; // Link tail's next to newNode
        newNode.prev = tail; // Link newNode's prev to tail
        newNode.next = head; // Link newNode's next to head
        head.prev = newNode; // Update head's prev to newNode
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        do {
            System.out.print((currentNode.prev != null ? currentNode.prev.data : "null") +
                    " <- " + currentNode.data + " -> " +
                    (currentNode.next != null ? currentNode.next.data : "null") + "   \t");
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println();
    }

    public static void main(String[] args) {
        doublyCircularList list = new doublyCircularList();
        list.addFirst(55);
        list.addFirst(3);
        list.addLast(44);
        list.addLast(99);
        list.printList();
    }
}
