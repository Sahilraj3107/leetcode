class Solution:
    def minimumArea(self, grid: List[List[int]]) -> int:
        m ,n =len(grid), len(grid[0])
        st_row, st_col, end_row, end_col =1e9,1e9,-1,-1

        for i in range(m):
            for j in range(n):
                if grid[i][j]==1:
                    st_row =min(st_row,i) 
                    end_row =max(end_row,i) 
                    st_col = min(st_col, j)
                    end_col = max(end_col,j)
                    
        width, height =(end_row-st_row+1), (end_col-st_col+1)
        return  width*height              
        