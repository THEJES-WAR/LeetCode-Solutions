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
    public int getDecimalValue(ListNode head) {
        ListNode tptr = head;
        int c=0,x=0;
        while(tptr!=null){
            tptr=tptr.next;
            c++;
        }
        tptr=head;
        while(tptr!=null){
            c--;
            x+= (tptr.val==1) ?  (int)Math.pow(2,c) : 0;
            tptr=tptr.next;
        }
        return x;
    }
}