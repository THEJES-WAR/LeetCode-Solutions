class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode tptr = head.next;
        ListNode slow = head.next;
        int c = 0;

        while (tptr != null) {
            if (tptr.val != 0) {
                c += tptr.val;
            } else {
                slow.val = c;
                c = 0;
                if(tptr.next!=null) slow = slow.next;
            }
            tptr = tptr.next;
        }
        slow.next = null;
        return head.next;
    }
}