# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        if head ==None:
            return head
        dummy =ListNode(0)
        dummy.next =head

        prev =dummy
        curr =head

        nums_set =set(nums)

        while curr is not None:
            if curr.val in nums_set:
                prev.next =curr.next
            else:
                prev =curr
            curr= curr.next
        return dummy.next
