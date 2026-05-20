class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        store = set()
        total = 0
        res =[0,0]

        for i in range(n):
            for j in range(n):
                if grid[i][j] in store:
                    res[0]= grid[i][j]
                else:
                    total += grid[i][j]
                    store.add(grid[i][j])

        tot_len = n*n

        exp_sum = tot_len*(tot_len+1)//2
        res[1] = exp_sum - total

        return res


