class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        store =set()
        n =len(nums)

        for i in range(n):
            if nums[i] in store:
                return nums[i]
            store.add(nums[i])

        return 0           