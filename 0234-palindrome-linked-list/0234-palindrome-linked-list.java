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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        List<Integer> list =new ArrayList<>();

        ListNode curr =head;
        while(curr!=null){
            list.add(curr.val);
            curr =curr.next;
        }

        int i=0, j=list.size()-1;

        while(i<j){
            if(list.get(i)!=list.get(j))return false;
            i++;
            j--;
        }
        return true;
    }
}