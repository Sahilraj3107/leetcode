class Solution:
    def numSubmat(self, mat: List[List[int]]) -> int:
        m,n =len(mat), len(mat[0])

        h= [0]*n
        res=0

        for i in range(m):
            for j in range(n):
                h[j]=h[j]+1 if mat[i][j] else 0
            sm, st = [0]*n, []
            for j in range(n):
                while st and h[st[-1]] >=h[j]:
                    st.pop()
                if st:
                    p = st[-1]
                    sm[j]= sm[p] + h[j]*(j-p)
                else:
                    sm[j] = h[j]*(j+1)
                st.append(j)
                res += sm[j]
        return res                      