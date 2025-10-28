class Solution:
    def countValidSelections(self, nums: List[int]) -> int:
        left, count, right = 0,0, sum(nums)

        for num in nums:
            left+=num
            right-=num

            if num!=0:
                continue
            if left==right: count+=2
            if abs(right-left)==1: count+=1
        return count        

        