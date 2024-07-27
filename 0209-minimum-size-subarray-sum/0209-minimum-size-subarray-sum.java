class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0, sum =0,n=nums.length;
        int res =Integer.MAX_VALUE;
        
        while(r<n){
            sum +=nums[r];

            while(sum>=target){
                res =Math.min(res, (r-l+1));
                sum -= nums[l];
                l++;
            }
            r++;
        }
         if(res==Integer.MAX_VALUE)return 0;
        return res;
    }
}