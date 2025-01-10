package LinkedList;

//Q. Add a node at nth position for exa -> n = 3 
public class Question2 {
    NODE head;

    class NODE {
        int data;
        NODE next;

        NODE(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First in the Linked List
    public void addFirst(int data) {
        NODE newNode = new NODE(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last in the Linked List
    public void addLast(int data) {
        NODE newNode = new NODE(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NODE currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        NODE cNode = head;
        while (cNode != null) {
            System.out.print(cNode.data + " -> ");
            cNode = cNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void addAtNth(int n, int data) {
        if (n <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        NODE newNode = new NODE(data);

        // Case 1: Insert at the head (position 1)
        if (n == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert at any other position
        NODE currentNode = head;
        int i = 1;

        // Traverse to the (n-1)th node
        while (i < n - 1 && currentNode != null) {
            currentNode = currentNode.next;
            i++;
        }

        // If `n` is greater than the length of the list
        if (currentNode == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        // Insert the new node
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.addFirst(12);
        obj.addFirst(44);
        obj.addLast(34);
        obj.addLast(11);
        obj.printList();
        obj.addAtNth(3, 30);
        obj.printList();
    }
}
