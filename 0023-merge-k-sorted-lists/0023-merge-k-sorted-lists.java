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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> x = new PriorityQueue<>();
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for(ListNode i : lists){
            while(i!=null){
                x.add(i.val);
                i = i.next;
            }
        }
        while(!x.isEmpty()){
            dummy.next = new ListNode(x.poll());
            dummy = dummy.next;
        }
        return res.next;
    }
}