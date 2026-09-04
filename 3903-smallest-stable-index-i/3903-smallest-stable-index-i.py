class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)
        arr1 =[0]*n
        arr2 =[0]*n
        maxi = -1
        for i in range(n):
            arr1[i] = max(maxi, nums[i])
            maxi = arr1[i]

        mini = 1e9
        for i in range(n-1, -1,-1):
            arr2[i]= min(mini, nums[i])
            mini = arr2[i]

        for i in range(n):
            if (arr1[i]-arr2[i])<=k:
                return i
        return -1        