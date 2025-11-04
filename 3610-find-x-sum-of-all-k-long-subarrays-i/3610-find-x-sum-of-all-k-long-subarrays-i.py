import heapq
class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        n =len(nums)
        res = []
        for i in range(n-k+1):
            mpp ={}
            temp =x
            for j in range(i,i+k):

                if nums[j] not in mpp:
                    mpp[nums[j]]=1
                else:
                    mpp[nums[j]]+=1

            heap =[]
            xsum =0
            for key,value in mpp.items():
                heapq.heappush(heap,(-value,-key))  
            
            while temp>0 and len(heap)>0:
                value, key =heapq.heappop(heap)
                key, value =-key, -value

                xsum += key*value
                temp-=1
            res.append(xsum)    
        return res        
