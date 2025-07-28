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
    public int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tptr = head,res = head;
        while(tptr.next!=null){
            ListNode temp = tptr.next;
            ListNode x = new ListNode(gcd(tptr.val,tptr.next.val));
            tptr.next = x;
            x.next = temp;                        
            tptr = tptr.next.next;
        }
        return head;

    }
}