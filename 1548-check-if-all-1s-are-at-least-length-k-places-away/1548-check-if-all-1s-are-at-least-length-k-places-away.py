class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        n =len(nums)
        i,j =-1,-1

        for idx in range(n):
            if nums[idx]==1:
                i=j
                j=idx
                if i!=-1 :
                    if (j-i-1)<k:
                        return False
        return True                

