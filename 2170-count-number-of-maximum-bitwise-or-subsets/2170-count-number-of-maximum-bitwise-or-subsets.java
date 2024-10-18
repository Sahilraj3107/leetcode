class Solution {
    private int countSubset(int[] nums, int idx, int curr, int max){
        if(idx ==nums.length){
            return (curr==max) ? 1:0;
        }

        int notTake =  countSubset(nums, idx+1, curr, max);
        int take =countSubset(nums, idx+1, curr |nums[idx], max);

        return take +notTake;
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr =0;

        for(int num:nums){
            maxOr =maxOr | num;
        }

        return countSubset(nums,0,0,maxOr);
    }


}