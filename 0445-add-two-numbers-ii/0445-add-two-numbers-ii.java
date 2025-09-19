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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> x = new Stack<>();
        Stack<Integer> y = new Stack<>();
        ListNode head = null;
        while(l1!=null){
            x.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            y.add(l2.val);
            l2 = l2.next;
        }
        int c = 0;
        while(!y.isEmpty() || !x.isEmpty() || c!=0){
            int sum = c;
            if(!x.isEmpty()){
                sum+= x.pop();
            }
            if(!y.isEmpty()){
                sum+= y.pop();
            }
            c = sum/10;
            ListNode node = new ListNode(sum%10);
            node.next = head;
            head = node;
        }
        
        return head;
    }
}