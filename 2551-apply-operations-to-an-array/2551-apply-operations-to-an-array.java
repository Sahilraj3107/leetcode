class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int k = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                ans[k++] = nums[i];
        }

        while (k < n)
            ans[k++] = 0;
        return ans;
    }
}