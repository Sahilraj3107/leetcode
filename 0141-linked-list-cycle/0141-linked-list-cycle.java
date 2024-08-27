/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        int cnt=0;

        while(fast!=null && fast.next!=null){
            if(cnt==0){
                slow =slow.next;
                fast=fast.next.next;
                cnt++;
                continue;
            }
             slow =slow.next;
             fast=fast.next.next;
            if(slow ==fast)return true;
        }
        return false;
    }
}