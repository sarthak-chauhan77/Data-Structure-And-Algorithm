package LinkedList;

//Q. Delete a node from nth position for exa -> n = 3 
public class Question1 {
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

    public void deleteNth(int n) {
        if (n <= 0) {
            System.out.println("Invalid position! Position must be greater than 0.");
            return;
        }

        // Case 1: Delete the head node
        if (n == 1) {
            if (head == null) {
                System.out.println("The list is empty. Nothing to delete.");
                return;
            }
            head = head.next;
            return;
        }

        // Case 2: Delete a node other than the head
        NODE currentNode = head;
        int i = 1;

        // Traverse to the (n-1)th node
        while (i < n - 1 && currentNode != null) {
            currentNode = currentNode.next;
            i++;
        }

        // Check if the nth node exists
        if (currentNode == null || currentNode.next == null) {
            System.out.println("Position out of bounds! No node exists at position " + n + ".");
            return;
        }

        // Delete the nth node
        currentNode.next = currentNode.next.next;
    }

    public static void main(String[] args) {
        Question1 obj = new Question1();
        obj.addFirst(12);
        obj.addFirst(44);
        obj.addLast(34);
        obj.addLast(11);
        obj.printList();
        obj.deleteNth(3);
        obj.printList();
    }
}
