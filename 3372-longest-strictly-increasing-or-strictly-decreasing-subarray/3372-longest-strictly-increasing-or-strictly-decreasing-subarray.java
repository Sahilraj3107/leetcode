class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, temp1 = 1, temp2 = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                temp1++;
            else {
                inc = Math.max(inc, temp1);
                temp1 = 1;
            }
            if (nums[i] < nums[i - 1])
                temp2++;
            else {
                dec = Math.max(dec, temp2);
                temp2 = 1;
            }
        }
        inc = Math.max(inc, temp1);
        dec = Math.max(dec, temp2);

        return Math.max(inc, dec);
    }
}