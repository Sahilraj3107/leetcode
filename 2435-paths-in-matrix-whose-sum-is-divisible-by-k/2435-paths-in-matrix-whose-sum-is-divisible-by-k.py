class Solution:
    def numberOfPaths(self, grid: List[List[int]], k: int) -> int:
        m, n = len(grid), len(grid[0])
        MOD = 10**9 + 7
        
        
        dp = [[[-1] * k for _ in range(n)] for _ in range(m)]
        
        def dfs(row: int, col: int, sum_mod: int) -> int:
            
            if row == 0 and col == 0:
                if (sum_mod + grid[0][0]) % k == 0:
                    return 1
                return 0
            
            
            if row < 0 or col < 0:
                return 0
            
           
            if dp[row][col][sum_mod] != -1:
                return dp[row][col][sum_mod]
            
           
            new_sum_mod = (sum_mod + grid[row][col]) % k
            
            
            from_top = dfs(row - 1, col, new_sum_mod)
            from_left = dfs(row, col - 1, new_sum_mod)
            
            
            dp[row][col][sum_mod] = (from_top + from_left) % MOD
            return dp[row][col][sum_mod]
        
        return dfs(m - 1, n - 1, 0)