class Solution {
    private void swap(int[] nums, int j) {
     
    }

    private int countSetBit(int num) {
        return Integer.bitCount(num);
    }

    public boolean canSortArray(int[] nums) {
        int n = nums.length;

            for (int j = 0; j < (n -1); j++) {
                if (nums[j] > nums[j + 1]) {
                    int num1 = countSetBit(nums[j]);
                    int num2 = countSetBit(nums[j + 1]);
                    if (num1 != num2)
                        return false;
                     int temp = nums[j];
                     nums[j] = nums[j + 1];
                     nums[j + 1] = temp;
                }
            }

          for(int i=(n-1);i>0;i--){
            if(nums[i]<nums[i-1]){
                 int num1 = countSetBit(nums[i]);
                    int num2 = countSetBit(nums[i - 1]);
                    if (num1 != num2)
                        return false;
                       int temp = nums[i];
                       nums[i] = nums[i - 1];
                       nums[i - 1] = temp;
                }
            }  
        return true;

    }
}