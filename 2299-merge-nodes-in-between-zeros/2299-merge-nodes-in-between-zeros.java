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
    public ListNode mergeNodes(ListNode head) {
        ListNode tptr = head.next;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        int c = 0,flag = 0;
        while(tptr!=null){
            if(tptr.val!=0){
                c+=tptr.val;
            }
            else{
                ListNode n = new ListNode(c);
                c = 0;
                res.next = n;
                res = res.next;
            }
            tptr = tptr.next;
        }
        return dummy.next;
    }
}