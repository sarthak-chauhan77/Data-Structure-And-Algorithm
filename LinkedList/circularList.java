package LinkedList;

public class circularList {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Circular link
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != head) { // Find the last node
            currentNode = currentNode.next;
        }
        newNode.next = head; // Link new node to head
        currentNode.next = newNode; // Link last node to new node
        head = newNode; // Update head to new node
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Circular link
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != head) { // Find the last node
            currentNode = currentNode.next;
        }
        currentNode.next = newNode; // Link last node to new node
        newNode.next = head; // Link new node back to head
    }

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        do {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        circularList obj = new circularList();
        obj.addLast(34);
        obj.addLast(3);
        obj.addFirst(12);
        obj.addLast(8);
        obj.printList();
    }
}
