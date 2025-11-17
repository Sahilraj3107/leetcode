class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        set1 =[set()]
        res =[0]*(2)

        for num in nums:
            if num in set1:
                res[0]=num
            else:
                set1.append(num)

        for i in range(1,len(nums)+1):
            if i not in set1:
                res[1]=i
                break
        return res                    