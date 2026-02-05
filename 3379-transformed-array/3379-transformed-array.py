class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        return [nums[(idx + val)% len(nums)] for idx, val in enumerate(nums)]
        