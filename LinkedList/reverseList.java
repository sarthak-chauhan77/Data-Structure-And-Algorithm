package LinkedList;

class Question3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // Update head to point to the new first node
        head = prev;
    }

    // Add a node to the end of the list
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

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Question3 list = new Question3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("Original List:");
        list.printList();
        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
}
