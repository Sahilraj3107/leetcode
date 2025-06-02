class Solution {
public:
    int f(int row,int col,vector<vector<int>>& dp){
        if(row<0 || col<0)return 0;
        if(row==0 && col==0)return 1;
        if(dp[row][col]!=-1)return dp[row][col];

        int up =f(row-1,col,dp);
        int left =f(row, col-1,dp);

        return dp[row][col]=(up+left);
    }
    int uniquePaths(int n, int m) {
        vector<vector<int>> dp(n,vector<int>(m,-1));
        // return f(n-1,m-1,dp);
        for(int i=0;i<m;i++)dp[0][i] =1;
        for(int i=0;i<n;i++)dp[i][0] =1;

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j] =dp[i-1][j] +dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
};