class Solution:
    def countUnguarded(self, m: int, n: int, guards_: List[List[int]], walls_: List[List[int]]) -> int:
        grid = [[0] * n for _ in range(m)]  # 0=safe, 1=guarded, 2=guard, 3=wall
        
        guards = {tuple(pair) for pair in guards_}
        walls = {tuple(pair) for pair in walls_}
        
        # Mark guards and walls
        for i, j in guards:
            grid[i][j] = 2
        for i, j in walls:
            grid[i][j] = 3
        
        # Process each row
        for i in range(m):
            guarded = False
            for j in range(n):
                if grid[i][j] == 2:  # guard
                    guarded = True
                elif grid[i][j] == 3:  # wall
                    guarded = False
                elif guarded and grid[i][j] == 0:
                    grid[i][j] = 1
            
            # Right to left
            guarded = False
            for j in range(n-1, -1, -1):
                if grid[i][j] == 2:
                    guarded = True
                elif grid[i][j] == 3:
                    guarded = False
                elif guarded and grid[i][j] == 0:
                    grid[i][j] = 1
        
        # Process each column
        for j in range(n):
            guarded = False
            for i in range(m):
                if grid[i][j] == 2:
                    guarded = True
                elif grid[i][j] == 3:
                    guarded = False
                elif guarded and grid[i][j] == 0:
                    grid[i][j] = 1
            
            # Bottom to top
            guarded = False
            for i in range(m-1, -1, -1):
                if grid[i][j] == 2:
                    guarded = True
                elif grid[i][j] == 3:
                    guarded = False
                elif guarded and grid[i][j] == 0:
                    grid[i][j] = 1
        
        # Count safe cells
        return sum(row.count(0) for row in grid)