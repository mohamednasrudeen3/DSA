package NasruPracticeforDSA.TOP150;

import java.util.PriorityQueue;



public class Example16 {

    // Function to merge k sorted linked lists
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all nodes' values into the hea
        //
        // p
        for (ListNode list : lists) {
            while (list != null) {
                minHeap.add(list.val);
                list = list.next;
            }
        }

        // Build the merged linked list
        ListNode dummy = new ListNode(0);
        ListNode merge = dummy;

        while (!minHeap.isEmpty()) {
            merge.next = new ListNode(minHeap.remove());
            merge = merge.next;
        }

        return dummy.next;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example input: [[1,4,5],[1,3,4],[2,6]]

        // First list: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // Second list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Third list: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        // Put all lists into array
        ListNode[] lists = new ListNode[]{l1, l2, l3};

        // Call merge function
        Example16 solution = new Example16();
        ListNode merged = solution.mergeKLists(lists);

        // Print merged result
        printList(merged);
    }
}
