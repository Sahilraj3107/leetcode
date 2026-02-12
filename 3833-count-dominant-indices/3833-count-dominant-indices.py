class Solution:
    def dominantIndices(self, nums: List[int]) -> int:
        n = len(nums)
        total =sum(nums)
        cnt =0

        for i in range(n-1):
            total -= nums[i]
            average = total/(n-i-1)
            if nums[i]> average:
                cnt+=1
        return cnt        


        
        