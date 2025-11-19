class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        arr =set(nums)
        target=original

        while target in arr:
            target*=2

        return target     

        