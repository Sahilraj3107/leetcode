class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        l,r,cnt =0,0,0
        res =0

        while r<len(nums):
            cnt += 1- nums[r]
            
            while cnt>1:
                cnt -= 1- nums[l]
                l+=1
            res =max((r-l+1),res)
            r+=1

        return res-1        


        