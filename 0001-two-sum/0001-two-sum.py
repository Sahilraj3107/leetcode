class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mpp ={}

        for i in range(len(nums)):
            curr = target - nums[i]
            if curr in mpp:
                return [mpp[curr],i]
            else:
                mpp[nums[i]]=i
        return -1            