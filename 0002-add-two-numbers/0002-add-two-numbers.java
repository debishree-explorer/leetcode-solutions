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
        // dummy node for result list
        ListNode dummy = new ListNode(0);

        // current pointer
        ListNode current = dummy;

        int carry = 0;

        // loop until both lists end
        while (l1 != null || l2 != null) {

            int x = 0;
            int y = 0;

            // get value from l1
            if (l1 != null) {
                x = l1.val;
            }

            // get value from l2
            if (l2 != null) {
                y = l2.val;
            }

            int sum = x + y + carry;

            // update carry
            carry = sum / 10;

            // digit to store
            int digit = sum % 10;

            // create new node
            current.next = new ListNode(digit);

            // move current forward
            current = current.next;

            // move l1 forward
            if (l1 != null) {
                l1 = l1.next;
            }

            // move l2 forward
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // if carry remains
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // return actual list
        return dummy.next;
    }
}