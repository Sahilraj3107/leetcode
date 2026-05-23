class Solution:
    def check(self, nums: List[int]) -> bool:
        n = len(nums)
        idx =-1
        rotated = False
        for i in range(1,n):
            if nums[i]< nums[i-1]:
                if rotated:
                    return False
                else:
                    rotated = True    
                if nums[0]< nums[n-1]:
                    return False

        return True                 