class Solution:
    def minElement(self, nums: List[int]) -> int:
        n = len(nums)
        mini =1e9
        for i in range(n):
            curr = nums[i]
            temp =0
            while curr>0:
                temp += curr%10
                curr = curr//10
            mini =min(mini, temp)

        return mini    
