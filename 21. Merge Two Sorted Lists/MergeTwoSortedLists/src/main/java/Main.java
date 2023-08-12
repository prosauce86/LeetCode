public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Base cases where recursion reaches end of one of the lists
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // compare heads of both lists
        ListNode head;
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        head.next = mergeTwoLists(l1, l2);
        return head;
        // Time complexity O(m + n)
        // Space complexity O(m + n)
    }

    public ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {
        // keep track of the head of the new list, and the tail to add on to
        ListNode head = new ListNode();
        ListNode tail = head;

        // iterate until we reach the end of one list
        while (l1 != null && l2 != null) {
            // compare the heads of the two lists
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        tail.next = l1 == null ? l2 : l1; // if l1 is empty add l2 to tail pointer, otherwise add l1

        return head.next; // head.next because pointer at front of list is empty since we used tail as a pointer
        // Time complexity O(m + n)
        // Space complexity O(1)
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}