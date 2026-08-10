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
    public ListNode sortList(ListNode head) {
ArrayList<Integer> ans = new ArrayList<>();
        
        // 2. Extract values from the linked list
        ListNode temp = head;
        while (temp != null) {
            ans.add(temp.val);
            temp = temp.next;
        }
        
        // 3. Sort the array list in-place (O(n log n) time complexity)
        Collections.sort(ans);
        
        // 4. Put the sorted values back into the nodes one by one
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = ans.get(i);
            i++;
            temp = temp.next;
        }
        
        return head;
        
    }
}