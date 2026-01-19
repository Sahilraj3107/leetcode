class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mpp =  {}
        res =[]
        n = len(nums)
        for num in nums:
            if num in mpp:
                mpp[num]+=1
            else:
                mpp[num]=1

        m = sorted(mpp.items(), key =lambda x: x[1], reverse= True)

        for key, value in m:
            res.append(key)
            k-=1
            if k<=0:
                return res
        return [0]        
        


        


