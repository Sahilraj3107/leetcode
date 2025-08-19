class Solution:
    def numberOfArithmeticSlices(self, nums: List[int]) -> int:
        if len(nums)<3:
            return 0

        diff,cnt,res= nums[1]-nums[0],1,0    

        for i in range(2,len(nums)) :
            if nums[i]-nums[i-1]==diff:
                cnt+=1
            else:
                diff =nums[i]-nums[i-1]
                cnt=1

            res +=cnt-1
        return res        


        