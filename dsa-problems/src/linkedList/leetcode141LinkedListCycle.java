package src.linkedList;

public class leetcode141LinkedListCycle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode s1 = new ListNode(2);
        ListNode s2 = new ListNode(6);
        System.out.println("---hascycle--"+ sol.hasCycle(s2));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
