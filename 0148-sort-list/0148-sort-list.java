/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode node = new ListNode(0), p = node;

        while(left != null && right != null){
            if(left.val > right.val){
                p.next = right;
                right = right.next;
            } else {
                p.next = left;
                left = left.next;
            }

            p = p.next;
        }

        if(left != null){
            p.next = left;
        }

        if(right != null){
            p.next = right;
        }

        return node.next;
    }
}