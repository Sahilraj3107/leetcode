class Solution {
public:
    int f(int idx,int amount, vector<int>& coins,vector<vector<int>>& dp){
        if(amount==0)return 1;
        if(idx ==0)return (amount%coins[0]==0);
        
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        
        int notTake = f(idx-1,amount,coins,dp);
        int Take =0;
        if(coins[idx]<=amount)Take =f(idx,amount-coins[idx],coins,dp);

        return dp[idx][amount]=notTake + Take;
    }
    int change(int amount, vector<int>& coins) {
        
        vector<vector<int>> dp(coins.size(),vector<int>(amount+1, -1));
        return f(coins.size()-1,amount, coins, dp);
    }
};