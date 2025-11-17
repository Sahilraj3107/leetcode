class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        n =len(nums)
        cnt=0
        maxOne=0

        for i in range(n):
            if  nums[i]==1:
                cnt+=1
            else:
                maxOne =max(maxOne,cnt)
                cnt=0
        maxOne =max(maxOne,cnt)
        return maxOne           



        