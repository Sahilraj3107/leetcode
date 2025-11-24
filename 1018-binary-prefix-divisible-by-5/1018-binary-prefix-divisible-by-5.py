class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        n =len(nums)
        res =[False]*(n)
        s =""
        for i in range(n):
            s +=str(nums[i])
            binaryToNum =int(s,2)
            # print(binaryToNum)
            if binaryToNum%5==0:
                res[i]=True
        return res        
        