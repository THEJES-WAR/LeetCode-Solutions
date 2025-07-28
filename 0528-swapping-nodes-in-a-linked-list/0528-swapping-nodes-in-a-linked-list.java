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
    public ListNode swapNodes(ListNode head, int k) {
        int c = 0,i=0;
        ListNode tptr = head,p1=null,p2=null;
        while(tptr!=null){
            c++;
            tptr = tptr.next;
        }
        int d = 0;
        tptr = head;
        while(tptr!=null){
            if(d==k-1){
                p1 = tptr;
            }
            if(d==c-k){
                p2 = tptr;
            }
            tptr=tptr.next;
            d++;
        }
        int temp = p1.val;
        p1.val = p2.val;
        p2.val = temp;
        return head;
    }
}