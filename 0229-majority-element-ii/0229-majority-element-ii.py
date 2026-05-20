class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n = len(nums)
        mpp ={}

        for num in nums:
            if num in mpp:
                mpp[num]+=1
            else:
                mpp[num]=1
        res =[]
        for key, val in mpp.items():
            if val>(n//3):
                res.append(key) 
        return res              