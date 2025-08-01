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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tptr = head;
        int c = 0;
        while (tptr != null) {
            c++;
            tptr = tptr.next;
        }
        tptr = head;
        int x = c / k;
        while (x != 0) {
            ListNode st = tptr;
            for(int i=0;i<k;i++){
                tptr = tptr.next;
            }
            ListNode end = tptr;
            ListNode left = st;
            for(int i=0;i<k/2;i++){
                ListNode right = st;
                for(int j=0;j<k-1-i;j++){
                    right = right.next;
                }
                int temp = left.val;
                left.val = right.val;
                right.val = temp;
                left = left.next;
            }
            x--;
        }
        return head;
    }
}