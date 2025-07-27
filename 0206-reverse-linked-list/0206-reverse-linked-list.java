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
    public ListNode reverseList(ListNode head) {
        ListNode tptr = head,prev=null,temp=null;
        while(tptr!=null){
            temp=tptr.next;
            tptr.next=prev;
            prev=tptr;
            tptr=temp;
        }
        return prev;
    }
}