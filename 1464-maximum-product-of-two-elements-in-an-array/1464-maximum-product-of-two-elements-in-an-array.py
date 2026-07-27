class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        res = -1
        for i in range(n):
            for j in range(i+1,n):
                curr = (nums[i]-1)*(nums[j]-1)
                res = max(res, curr)
        return res        
