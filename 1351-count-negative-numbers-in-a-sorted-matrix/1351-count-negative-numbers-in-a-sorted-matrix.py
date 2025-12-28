class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        cnt =0

        for arr in grid:
            for num in arr:
                if num<0:
                    cnt+=1
        return cnt             
        