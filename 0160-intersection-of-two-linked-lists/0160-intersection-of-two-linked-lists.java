/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        ListNode ta=heada,tb=headb;
        while(ta!=tb){
            ta=ta.next;
            tb=tb.next;
            if(ta==tb) return ta;
            if(ta==null) ta=headb;
            if(tb==null) tb=heada;
        }
        return ta;
    }
}