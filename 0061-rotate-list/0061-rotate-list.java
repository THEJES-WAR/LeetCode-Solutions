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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head, prev = null, fast = head, temp = null,x = head;
        int c = 0;
        if(head==null || head.next==null) return head;
        int r=0;
        while(x!=null){
            x=x.next;
            r++;
        }
        k = k%r;
        if(k == 0) return head;
        while (c != k) {
            while (fast.next != null) {
                prev = fast;
                fast = fast.next;
            }
            fast.next = slow;
            prev.next = null;
            slow = fast;
            c++;
        }
        return fast;
    }
}