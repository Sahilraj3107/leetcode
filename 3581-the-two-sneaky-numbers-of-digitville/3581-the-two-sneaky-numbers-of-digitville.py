class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        list1 =[]
        res=[]

        for num in nums:
            if num in list1:
                res.append(num)
                if len(res)==2:
                    return res
            else:
                list1.append(num)
        return res                
        