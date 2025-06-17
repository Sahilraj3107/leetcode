class Solution {
public:
    bool f(vector<int>& nums, int idx, int k, vector<vector<int>>& dp){
        if(k==0)return true;
        if(idx==0)return nums[0]==k;

        if(dp[idx][k]!=-1)return dp[idx][k];

        bool notTake = f(nums,idx-1,k,dp);
        if(notTake)return dp[idx][k]=true;

        bool Take =false;

        if(nums[idx]<=k)Take =f(nums,idx-1,k-nums[idx],dp);

        return dp[idx][k]=Take;
    }
    bool canPartition(vector<int>& nums) {
        int sum =0;
        
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
        }
        if(sum%2!=0)return false;
     
    vector<vector<int>> dp(nums.size(),vector<int>(sum/2+1,-1));
     return f(nums,nums.size()-1,sum/2,dp);

    }
};