class Solution:
    def largestGoodInteger(self, nums: str) -> str:
        cnt,n=1,-1

        for i in range(1,len(nums)):
            if cnt>=3 and int(nums[i-1])>=n:
                n =int(nums[i-1])
            if nums[i]==nums[i-1]:
                cnt+=1
            else:
                cnt =1
        if cnt>=3 and int(nums[len(nums)-1])>=n:
            n = int(nums[len(nums)-1])

        if n<0: return ""

        res = str(n) + str(n) + str(n)
        return res