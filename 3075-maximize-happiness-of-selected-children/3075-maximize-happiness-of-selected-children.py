class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        happiness.sort(reverse =True)
        cnt=0

        for i in range(len(happiness)):
            if k<=0 :
                break
            if happiness[i]-i<=0:
                break
            cnt += (happiness[i]-i)
            k-=1
        return cnt            

