
public class Main {
    public static void main(String[] args) {

    }
}

// Definition for singly-linked list.
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
 

class Solution {
    public ListNode middleNode(ListNode head) {
        // Using pointers. Slow moves at 1x speed and fast moves at 2x
        ListNode middlePointer = head;
        ListNode endPointer = head;
        while (endPointer != null && endPointer.next != null) {
            middlePointer = middlePointer.next;
            endPointer = endPointer.next.next;
        }
        return middlePointer;
    }
}