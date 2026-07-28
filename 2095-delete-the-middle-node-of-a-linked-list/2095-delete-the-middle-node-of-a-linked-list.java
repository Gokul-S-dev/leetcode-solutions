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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head = head.next;
            return head;
        }
        ListNode faster = head;
        ListNode slower = head;
        ListNode prev = head;
        while(faster != null && faster.next!=null){
            faster = faster.next.next;
            prev = slower;
            slower = slower.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}