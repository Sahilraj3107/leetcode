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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set =new HashSet<>();
        for(int it: nums){
            set.add(it);
        }

        ListNode dummy =new ListNode();
        ListNode curr =dummy;
        ListNode trav =head;
           
        while(trav!=null){
            if(!set.contains(trav.val)){
               curr.next =trav;
               curr =curr.next;
            }
            trav =trav.next;
        }
       curr.next =null;
         
        return dummy.next;
    }
}