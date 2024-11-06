class Solution {
    private void swap(int[] nums, int j) {
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;
    }

    private int countSetBit(int num) {
        return Integer.bitCount(num);
    }

    public boolean canSortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (nums[j] > nums[j + 1]) {
                    int num1 = countSetBit(nums[j]);
                    int num2 = countSetBit(nums[j + 1]);
                    if (num1 != num2)
                        return false;
                    swap(nums, j);
                }
            }
        }

        return true;

    }
}