class Solution:
    def countSquares(self, mat: List[List[int]]) -> int:
        n,m,total =len(mat), len(mat[0]), 0

        for i in range(n):
            for j in range(m):
                if mat[i][j]==1:
                    if i==0 or j==0:
                        total+=1
                    else:
                        mat[i][j]= min(mat[i-1][j], mat[i][j-1],mat[i-1][j-1])+1
                        total +=mat[i][j]
        return total                    
        
                    