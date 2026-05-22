class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        m,n = len(mat), len(mat[0])
        if (m*n) != (r*c):
            return mat

        reshape =[[0]*c for i in range(r)]
        row, col=0,0
        for i in range(m):
            for j in range(n):
                reshape[row][col] = mat[i][j]
                if col ==(c-1):
                    row +=1
                    col = 0
                else:
                    col +=1
        return reshape                