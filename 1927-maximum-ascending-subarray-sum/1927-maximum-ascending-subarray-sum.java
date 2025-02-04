class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans = Math.max(ans, sum);
                sum = nums[i];
            } else
                sum += nums[i];
        }
        ans = Math.max(ans, sum);
        return ans;
    }
}