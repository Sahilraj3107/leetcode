class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        buy= prices[0]
        res = -1e9
        for i in range(1,n):
            if prices[i]>buy:
                res = max(res, prices[i]-buy)
            if prices[i]< buy:
                buy = prices[i]    

        res = max(res,0)   
        return res    