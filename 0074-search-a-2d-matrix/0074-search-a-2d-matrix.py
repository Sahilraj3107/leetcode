class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n,m = len(matrix), len(matrix[0])
        row =-1

        for i in range(n):
            if target>= matrix[i][0] and target<=matrix[i][m-1]:
                row = i
                break        
        if row ==-1:
            return False        


        def binarySearch(matrix:List[int], target: int) -> bool:
            s,e =0, len(matrix)-1

            while s<=e:
                mid = s+ (e-s)//2
                if matrix[mid]==target:
                    return True
                elif matrix[mid]>target:
                    e = mid - 1
                else: 
                    s =mid +1
            return False

        return binarySearch(matrix[row], target)                     