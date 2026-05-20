class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n,m = len(matrix), len(matrix[0])
        dp =[[0]*m for i in range(n)]
        
        col= n-1
        for i in range(n):
            row= 0
            for j in range(m):
                dp[row][col] = matrix[i][j]
                row+=1
            col -=1

        for i in range(n):
            for j in range(m):
                matrix[i][j]= dp[i][j]       