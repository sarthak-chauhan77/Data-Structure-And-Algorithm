package LinkedList;

// Check if a loop is present in the LinkedList
public class LoopDetection {
    private Node head;

    // Node class representing an element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Adds a node with the given data to the beginning of the linked list.
     *
     * @param data The value to be added.
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Adds a node with the given data to the end of the linked list.
     *
     * @param data The value to be added.
     */
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /**
     * Checks if a loop is present in the linked list using Floyd's Cycle Detection
     * Algorithm.
     *
     * @return True if a loop is present; otherwise, false.
     */
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false; // No loop detected
    }

    /**
     * Prints the elements of the linked list.
     */
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LoopDetection list = new LoopDetection();

        // Add elements to the list
        list.addFirst(12);
        list.addFirst(44);
        list.addLast(34);
        list.addLast(11);

        // Print the list
        System.out.println("Linked List:");
        list.printList();

        // Check for a loop
        if (list.hasLoop()) {
            System.out.println("The linked list contains a loop.");
        } else {
            System.out.println("The linked list does not contain a loop.");
        }

        // Create a loop for testing
        list.head.next.next.next.next = list.head.next; // Creating a loop
        if (list.hasLoop()) {
            System.out.println("The linked list contains a loop (after modification).");
        }
    }
}
