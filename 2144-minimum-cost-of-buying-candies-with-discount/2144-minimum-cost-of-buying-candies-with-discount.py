class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        if len(cost)==1:
            return cost[0]

        n=len(cost)    
        cost.sort()

        res =0
        for i in range(n-1, -1, -3):
            print(i)
            res += cost[i]
            if i!=0:
                res += cost[i-1]
        return res    