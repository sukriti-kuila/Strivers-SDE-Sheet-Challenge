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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        int carry = 0;
        ListNode newhead = new ListNode(-1);
        ListNode temp = newhead;
        int sum = 0;
        while (head1 != null || head2 != null)
        {
            if (head1==null)
            {
                sum = carry+head2.val;
                head2 = head2.next;
            }
            else if (head2==null)
            {
                sum = carry+head1.val;
                head1 = head1.next;
            }
            else
            {
                sum = head1.val+head2.val+carry;
                head1 = head1.next;
                head2 = head2.next;
            }
            ListNode node = new ListNode(sum%10);
            carry = sum/10;
            temp.next = node;
            temp = temp.next;
        }
        if (carry>0)
            temp.next = new ListNode(carry);

        return newhead.next;
    }
}
