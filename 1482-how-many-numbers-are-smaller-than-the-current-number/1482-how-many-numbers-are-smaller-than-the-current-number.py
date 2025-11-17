class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        n =len(nums)
        res =[0]*(n)
        for i in range(n):
            cnt =0
            for j in range(n):
                if nums[j]<nums[i]:
                    cnt+=1
            res[i]=cnt
        return res             

        