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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode o = new ListNode(0),e = new ListNode(0);
        ListNode q = o,i = e,tptr = head;
        int c=0;
        while(tptr!=null){
            c++;
            if(c%2!=0){
                o.next = tptr;
                o = o.next;
            }
            else{
                e.next = tptr;
                e = e.next;
            }
            tptr = tptr.next;
        }
        q = q.next;
        e.next = null; 
        o.next = i.next;
        return q;
    }
}