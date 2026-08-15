class Solution:
    def longestSubsequence(self, nums: List[int]) -> int:
        tot =0
        nonZero=0

        for num in nums:
            nonZero |= num>0
            tot^=num

        if tot!=0:
            return len(nums)

        if nonZero:
            return len(nums)-1

        return 0            