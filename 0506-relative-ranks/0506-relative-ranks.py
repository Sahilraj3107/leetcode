class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        n = len(score)
        pq =[]

        for i in range(n):
            heapq.heappush(pq,(-score[i],i))
        res =[0]*n
        top_performer =['Gold Medal', 'Silver Medal', 'Bronze Medal']
        cnt =0
        while len(pq)>0:
            top = heapq.heappop(pq)
            if cnt<3:
                res[top[1]]= top_performer[cnt]
            else:
                res[top[1]] = f"{cnt+1}" 
            cnt+=1       

        return res   