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
    public ListNode mergeNodes(ListNode head) {
        ListNode  dummy =head.next;
        ListNode currSum =dummy;

        while(currSum!=null){
            int sum =0;
             
             while(currSum.val!=0){
                sum += currSum.val;
                currSum =currSum.next;
             }
             dummy.val =sum;
             currSum =currSum.next;
             dummy.next =currSum;
             dummy =dummy.next;
        }
    return head.next;

    }
}