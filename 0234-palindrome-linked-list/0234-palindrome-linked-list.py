# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        curr = head
        s=""

        while curr!=None:
            s += f"{curr.val}"
            curr = curr.next
        return s== s[::-1]    