class Solution:
    def maximumAmount(self, coins: List[List[int]]) -> int:
        n, m = len(coins), len(coins[0])
        dp = [[[float('-inf')] * 3 for _ in range(m)] for _ in range(n)]

        for k in range(3):
            if coins[0][0] < 0 and k > 0:
                dp[0][0][k] = 0
            else:
                dp[0][0][k] = coins[0][0]

        # fill first row
        for j in range(1, m):
            for k in range(3):
                coin = coins[0][j] + dp[0][j-1][k]
                skip = float('-inf')
                if coins[0][j] < 0 and k > 0:
                    skip = dp[0][j-1][k-1]
                dp[0][j][k] = max(coin, skip)

        # fill first col
        for i in range(1, n):
            for k in range(3):
                coin = coins[i][0] + dp[i-1][0][k]
                skip = float('-inf')
                if coins[i][0] < 0 and k > 0:
                    skip = dp[i-1][0][k-1]
                dp[i][0][k] = max(coin, skip)

        # fill rest
        for i in range(1, n):
            for j in range(1, m):
                for k in range(3):
                    coin = coins[i][j] + max(dp[i-1][j][k], dp[i][j-1][k])
                    skip = float('-inf')
                    if coins[i][j] < 0 and k > 0:
                        skip = max(dp[i-1][j][k-1], dp[i][j-1][k-1])
                    dp[i][j][k] = max(coin, skip)

        return dp[n-1][m-1][2]