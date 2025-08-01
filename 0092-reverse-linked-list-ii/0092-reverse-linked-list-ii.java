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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode tptr = head, l = null, r = null;
        int c = 1;
        while (tptr != null) {
            if(c==left) l =tptr;
            if(c==right) r = tptr;
            tptr=tptr.next;
            c++;
        }
        while(left<right){
            int t = l.val;
            l.val = r.val;
            r.val = t;
            l = l.next;
            int i=1;
            ListNode temp = head;
            while(i<right-1){
                temp = temp.next;
                i++;
            }
            r = temp;
            right--;
            left++;
        }
        return head;
    }
}