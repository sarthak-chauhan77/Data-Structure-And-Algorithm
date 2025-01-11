package LinkedList;

public class PalindromeLinkedList {
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
     * Reverses the linked list starting from the given node.
     *
     * @param node The starting node of the list to reverse.
     * @return The new head of the reversed list.
     */
    private Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * Finds the middle node of the linked list.
     *
     * @param head The head node of the linked list.
     * @return The middle node.
     */
    private Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Checks if the linked list is a palindrome.
     *
     * @return True if the linked list is a palindrome; otherwise, false.
     */
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // A single node or empty list is a palindrome.
        }

        // Step 1: Find the middle of the linked list.
        Node middle = findMiddle(head);

        // Step 2: Reverse the second half of the linked list.
        Node secondHalfStart = reverse(middle);

        // Step 3: Compare both halves.
        Node firstHalfStart = head;
        Node secondHalfPointer = secondHalfStart;

        while (secondHalfPointer != null) {
            if (firstHalfStart.data != secondHalfPointer.data) {
                return false; // Mismatch found, not a palindrome.
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        // Step 4: Optional (restore the list to its original order).
        reverse(secondHalfStart);

        return true; // The list is a palindrome.
    }

    /**
     * Prints the linked list.
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
        PalindromeLinkedList list = new PalindromeLinkedList();

        // Add elements to the list.
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(2);
        list.addLast(1);

        // Print the list.
        System.out.println("Linked List:");
        list.printList();

        // Check and print if the list is a palindrome.
        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
