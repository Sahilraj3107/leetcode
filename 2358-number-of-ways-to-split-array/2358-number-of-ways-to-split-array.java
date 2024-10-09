class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum=0,leftSum=0;

        for(int num:nums){
            totalSum +=num;
        } 
       int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum +=nums[i];
            totalSum -=nums[i];
            if(leftSum>=totalSum)cnt++;
        }
        return cnt;
    }
}