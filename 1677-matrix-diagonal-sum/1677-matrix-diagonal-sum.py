class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n,m =len(mat), len(mat[0])
        i,j=0,0
        diagonal_sum =0

        while i<n and j<m:
            diagonal_sum +=mat[i][j]
            i+=1
            j+=1
        i,j =0, m-1
        while i<n and j>=0:
            if i!=j:
                diagonal_sum +=mat[i][j]
            i+=1
            j-=1   

        return diagonal_sum      

