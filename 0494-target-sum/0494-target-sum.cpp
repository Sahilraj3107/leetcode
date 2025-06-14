class Solution {
public:
    int f(vector<int>& nums, int idx, int k, vector<vector<int>>& dp){
        if (k < -1000 || k > 1000) return 0;
        if(idx==0){
            if((k +nums[0]==0) && (k-nums[0]==0))return 2; // when nums[0]=0;
            if((k +nums[0]==0) || (k-nums[0]==0))return 1;
            return 0;
        }
        if(dp[idx][1000 +k]!=-1)return dp[idx][1000+ k];

        int sub = f(nums, idx-1,k-nums[idx],dp);
        int add = f(nums, idx-1,k+nums[idx], dp);

        return dp[idx][1000 + k] = sub + add;
    }
    int findTargetSumWays(vector<int>& nums, int k) {
        int n =nums.size();
        vector<vector<int>> dp (n,vector<int>(2001,-1));

        return f(nums,n-1,k, dp);
    }
};