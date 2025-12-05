class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        tot =sum(nums)
        res =0
        left=0
        for num in nums:
            left +=num
            tot-=num
            if(abs(tot-left)%2==0) and tot!=0: res+=1

        return res      