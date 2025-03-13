class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n =nums.length;
        int[] diffArray =new int[n+1];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0], r=queries[i][1];
            diffArray[l]+=1;
            diffArray[r+1]-=1;
        }

        
        for(int i=1;i<=n;i++)
            diffArray[i] +=diffArray[i-1];
        
        for(int i=0;i<n;i++){
            if(diffArray[i]<nums[i])return false;
        }
        return true;
    }
}