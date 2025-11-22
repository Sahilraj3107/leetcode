class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        minOperation =0

        for num in nums:
            a,b =num%3, 3-num%3
            minOperation += min(a,b)
        return minOperation    

        