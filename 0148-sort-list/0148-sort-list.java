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
        if(head==null || head.next==null) return head;
        ListNode tptr = head;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        while(tptr!=null){
            p.add(tptr.val);
            tptr=tptr.next;
        }
        ListNode dummy = new ListNode(1);
        tptr = dummy;
        while(!p.isEmpty()){
            ListNode x = new ListNode(p.poll());
            tptr.next = x;
            tptr = tptr.next;
        } 
        return dummy.next;
    }
}