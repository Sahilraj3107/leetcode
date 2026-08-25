class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        arr = set(nums)

        i=1

        while i<=102:
            val= k*i
            if val not in arr:
                return val
            i+=1

        return 0