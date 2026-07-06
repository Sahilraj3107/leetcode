class Solution:
    def maxDigitRange(self, nums: list[int]) -> int:
        diff =[]
        maxi =0
        for num in nums:
            curr = num
            l,h =1e9,0
            while curr>0:
                val = curr%10
                l = min(l,val)
                h = max(h,val)
                curr= curr//10
            d = (h-l)
            maxi =max(maxi,d)
            diff.append(d)
        
        res =0
        for i in range(len(nums)):
            if diff[i]==maxi:
                res +=nums[i]
        return res               