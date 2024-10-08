class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0, prefixSum=0;

        for(int num :nums){
            totalSum +=num;
        }

        for(int i=0;i<nums.length;i++){
            if((prefixSum)==(totalSum-nums[i]))return i;
            prefixSum +=nums[i];
            totalSum -=nums[i];
        }
        return -1;
    }
}