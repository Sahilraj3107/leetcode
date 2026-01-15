class Solution:
    def f(self,bars: List[int]) -> int:
        bars.sort()

        res, streak=1,1

        for i in range(1, len(bars)):
            if bars[i]-bars[i-1]==1:
                streak +=1
            else:
                streak =1
            res = max(res, streak)
        return res+1       
    def maximizeSquareHoleArea(self, n: int, m: int, hBars: List[int], vBars: List[int]) -> int:
        return min(self.f(hBars), self.f(vBars))**2

             

        