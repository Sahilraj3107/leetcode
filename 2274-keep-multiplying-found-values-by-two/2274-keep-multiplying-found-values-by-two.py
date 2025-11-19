class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        nums.sort()
        target =original

        for num in nums:
            if num==target:
                target*=2

        return target        

        