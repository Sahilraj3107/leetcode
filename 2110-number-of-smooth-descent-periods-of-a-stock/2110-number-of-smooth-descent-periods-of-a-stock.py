class Solution:
    def getDescentPeriods(self, prices: List[int]) -> int:
        if len(prices)==1:
            return 1

        cnt,res=1,1

        for i in range(1,len(prices)):
            if prices[i-1]-prices[i]== 1:
                cnt+=1
            else:
                cnt=1
            res +=cnt
        return res            