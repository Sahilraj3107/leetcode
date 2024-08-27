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
        ListNode dummy =new ListNode();
        ListNode curr =dummy;
        int rem =0;
        while(l1!=null && l2!=null){
           int sum =l1.val +l2.val +rem;
           rem =sum/10;
           sum =sum%10;
           ListNode next =new ListNode(sum);
           curr.next =next;
           curr =curr.next;
           l1 =l1.next;
           l2 =l2.next;
        }
        
        while(l1!=null){
           int sum =l1.val +rem;
           rem =sum/10;
           sum =sum%10;
           ListNode next =new ListNode(sum);
           curr.next =next;
           curr =curr.next;
           l1 =l1.next;
        }

         while(l2!=null){
           int sum =l2.val +rem;
           rem =sum/10;
           sum =sum%10;
           ListNode next =new ListNode(sum);
           curr.next =next;
           curr =curr.next;
           l2 =l2.next;
        }
        if(rem!=0){
           ListNode next =new ListNode(rem);
           curr.next =next;
           curr =curr.next;
        }
        return dummy.next;
    }
}