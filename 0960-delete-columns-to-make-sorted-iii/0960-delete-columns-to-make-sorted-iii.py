class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        n,m = len(strs[0]), len(strs)
        dp =[1]*n

        for i in range(1,n):
            for j in range(i):
                flag = True
                for k in range(m):
                    if strs[k][j] > strs[k][i]:
                        flag = False
                        break
                if flag:
                    dp[i] = max(dp[i], dp[j] +1)
        mx =0
        for i in dp:
            mx = max(mx, i)
        return n-mx                        

        