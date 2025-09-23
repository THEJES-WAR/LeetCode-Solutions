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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tptr1 = l1,tptr2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while(tptr1!=null && tptr2!=null){
            if(tptr1.val<tptr2.val){
                dummy.next = new ListNode(tptr1.val);
                tptr1 = tptr1.next;
                dummy = dummy.next;
            }
            else{
                dummy.next = new ListNode(tptr2.val);
                tptr2 = tptr2.next;
                dummy = dummy.next;
            }
        }
        if(tptr1!=null) dummy.next = tptr1;
        else dummy.next = tptr2;
        return res.next;
    }
}