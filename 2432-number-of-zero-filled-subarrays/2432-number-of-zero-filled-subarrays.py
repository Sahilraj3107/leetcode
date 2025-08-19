class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        res,cnt=0,0

        for num in nums:
            if num==0:
                cnt+=1
            else:
                cnt=0
            res+=cnt
        return res                       