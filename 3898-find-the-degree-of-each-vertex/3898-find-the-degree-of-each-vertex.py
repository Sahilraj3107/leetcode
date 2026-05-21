class Solution:
    def findDegrees(self, matrix: list[list[int]]) -> list[int]:
        n = len(matrix)
        res =[]

        for i in range(n):
            cnt =0
            for j in range(n):
                cnt+= matrix[i][j]
            res.append(cnt)
        return res        