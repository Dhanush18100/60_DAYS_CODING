class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    
    // Function to reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;     // Store next node
            current.next = prev;     // Reverse the link
            prev = current;          // Move prev forward
            current = next;          // Move current forward
        }
        
        head = prev;  // New head after reversal
        return head;
    }
    
    // Function to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        System.out.println("Original List:");
        printList(head);
        
        head = reverse(head);
        
        System.out.println("Reversed List:");
        printList(head);
    }
}
