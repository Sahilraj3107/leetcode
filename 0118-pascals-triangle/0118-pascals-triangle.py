class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        triangle =[[1]]
        
        for i in range(1, numRows):
            temp =[1]*(i+1)
            for j in range(i+1):
                if j==0 or j==i:
                    continue
                temp[j] = triangle[i-1][j]+triangle[i-1][j-1]
            triangle.append(temp)
        return triangle           



        