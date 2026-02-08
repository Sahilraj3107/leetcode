# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def f(self, root: Optional[TreeNode]) -> int:
        if root==None:
            return 0

        left = self.f(root.left)
        if left==-1:
            return -1
        right = self.f(root.right)

        if right==-1:
            return -1

        if abs(left-right)>1:
            return -1

        return 1+ max(left,right)


    def isBalanced(self, root: Optional[TreeNode]) -> bool:

        res =self.f(root)
        return False if res== -1 else True
        