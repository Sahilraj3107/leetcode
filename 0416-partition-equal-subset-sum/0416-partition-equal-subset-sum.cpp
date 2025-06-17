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
     
    vector<vector<int>> dp(nums.size(),vector<int>(sum/2+1,0));
    //  return f(nums,nums.size()-1,sum/2,dp);

     dp[0][0]=true;
     if(nums[0]<=(sum/2))dp[0][nums[0]]=true;

     for(int i=1;i<nums.size();i++){
        for(int j=1;j<=sum/2;j++){
            dp[i][j]= dp[i-1][j];
            if(j-nums[i]>=0)dp[i][j] = dp[i][j] || dp[i-1][j-nums[i]];
        }
     }
     return dp[nums.size()-1][sum/2];


    }
};