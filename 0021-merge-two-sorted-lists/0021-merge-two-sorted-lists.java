/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;

        if(list1 == null && list2 == null){
            return head;
        } else if(list1 == null){
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        if(list1.val < list2.val){
            head = list1;
        } else {
            head = list2;
            list2 = list1;
            list1 = head;
        }

        while(list1.next != null){
            if(list1.next.val > list2.val){
                ListNode auxNode = list1.next;
                list1.next = list2;
                list2 = auxNode;
            }

            list1 = list1.next;
        }

        if(list1.next == null){
            list1.next = list2;
        }

        return head;
    }

}