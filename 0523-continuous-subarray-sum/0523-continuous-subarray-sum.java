class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
       mpp.put(0, -1); 
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            if (mpp.containsKey(rem)) {
                if (i - mpp.get(rem) > 1) {
                    return true;
                }
            } else {
                mpp.put(rem, i);
            }
        }

        return false;
    }
}