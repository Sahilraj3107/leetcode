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

    public int getSize(ListNode head){
        ListNode curr=head;
        int i=0;
        while(curr!=null){
            curr=curr.next;
            i++;
        }
        return i;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=getSize(head);
        int j=1;

        if(size==n){
            return head.next;
        }
        ListNode newHead=head;
        while(j<(size-n)){
         j++;
        head=head.next;
        }
        head.next=head.next.next ;
        return newHead;
    }
}