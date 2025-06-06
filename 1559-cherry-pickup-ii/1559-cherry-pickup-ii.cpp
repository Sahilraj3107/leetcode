class Solution {
public:
    int f(vector<vector<int>>& grid, int i, int j1, int j2,
          vector<vector<vector<int>>>& dp) {
        if (j1 < 0 || j2 < 0 || j1 >= grid[0].size() || j2 >= grid[0].size())
            return 0;
        if (i == grid.size() - 1)
            if(j1==j2)return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];

        if (dp[i][j1][j2] != -1)
            return dp[i][j1][j2];

        int leftleft = f(grid, i + 1, j1 - 1, j2 - 1, dp);
        int leftdown = f(grid, i + 1, j1 - 1, j2, dp);
        int leftright = f(grid, i + 1, j1 - 1, j2 + 1, dp);
        int downleft = f(grid, i + 1, j1, j2 - 1, dp);
        int downdown = f(grid, i + 1, j1, j2, dp);
        int downright = f(grid, i + 1, j1, j2 + 1, dp);
        int rightleft = f(grid, i + 1, j1 + 1, j2 - 1, dp);
        int rightdown = f(grid, i + 1, j1 + 1, j2, dp);
        int rightright = f(grid, i + 1, j1 + 1, j2 + 1, dp);

        int maxi = max(leftleft, max(leftdown, leftright));
        maxi = max(maxi, max(downleft, max(downdown, downright)));
        maxi = max(maxi, max(rightleft, max(rightdown, rightright)));

        dp[i][j1][j2] = maxi + grid[i][j1];
        if (j1 != j2)
            dp[i][j1][j2] += grid[i][j2];
        return dp[i][j1][j2];
    }
    int cherryPickup(vector<vector<int>>& grid) {
        int n = grid.size(), m = grid[0].size();
        vector<vector<vector<int>>> dp(n,vector<vector<int>>(m,vector<int>(m,-1)));

        return f(grid, 0, 0, m - 1, dp);
    }
};