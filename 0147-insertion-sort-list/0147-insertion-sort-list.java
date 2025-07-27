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
    public ListNode insertionSortList(ListNode head) {
        PriorityQueue<Integer> x = new PriorityQueue<>();
        ListNode tptr = head;
        ListNode re = new ListNode(0);
        ListNode dummy = re;
        while(tptr!=null){
            x.add(tptr.val);
            tptr=tptr.next;
        }
        while(!x.isEmpty()){
            re.next = new ListNode(x.poll());
            re = re.next;
        }
        return dummy.next;
    }
}