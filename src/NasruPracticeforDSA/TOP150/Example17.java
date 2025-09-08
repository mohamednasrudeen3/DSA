package NasruPracticeforDSA.TOP150;

public class Example17 {

    public static void main(String[] args) {
        // Build linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2; // Group size for reversal

        // Call reverseKGroup
        Example17 obj = new Example17();
        ListNode newHead = obj.reverseKGroup(head, k);

        // Print the result
        printList(newHead);  // Expected: 2 -> 1 -> 4 -> 3 -> 5

    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        // Use a dummy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers
        ListNode current = dummy, next = dummy, prev = dummy;

        // Count the number of nodes in the list
        int count = 0;
        while (current.next != null) {
            current = current.next;
            count++;
        }

        // Reverse in groups
        while (count >= k) {
            current = prev.next; // Current points to the start of the group
            next = current.next; // Next node to be processed
            for (int i = 1; i < k; i++) {
                // Reversal process
                current.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = current.next;
            }
            prev = current; // Move prev to the end of the reversed group
            count -= k; // Decrement count by k as k nodes have been reversed
        }
        return dummy.next;
    }
}
