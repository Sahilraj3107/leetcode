# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from queue import Queue
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        idx, maxSum =1,root.val
        q = Queue()
        q.put(root)
        res =1
        while(q.qsize()):
            size = q.qsize()
            currSum =0
            for i in range(size):
                curr = q.get()
                currSum +=curr.val

                if curr.left:
                    q.put(curr.left)
                if curr.right:
                    q.put(curr.right)
            if currSum>maxSum :
                maxSum =currSum
                res =idx
            idx+=1
        return res                   

