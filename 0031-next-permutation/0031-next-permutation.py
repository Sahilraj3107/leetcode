class Solution:
    def rev(self, nums: List[int], i: int, j: int)-> None:
        temp = nums[i]
        nums[i]= nums[j]
        nums[j] = temp
    def findBigger(self,  nums: List[int], start: int,pivot: int)-> int:
        for i in range(len(nums) - 1, start - 1, -1):
            if nums[i] > pivot:
                return i
        return -1          
        
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        index = -1
        pivot = -1
        for i in range(n-2,-1,-1):
            if nums[i]<nums[i+1]:
                pivot = i
                break

        if pivot == -1 :
            nums.reverse()
            return
        
        index = self.findBigger(nums, pivot+1, nums[pivot])
        self.rev(nums,pivot, index)

        left = pivot + 1
        right = n - 1
        while left < right:
            self.rev(nums, left, right)
            left += 1
            right -= 1