class Solution {
    public int f(int[] nums, int targetDistance) {
        int cnt = 0;
        int low = 0;

        for (int high = 1; high < nums.length; high++) {
            while (nums[high] - nums[low] > targetDistance) {
                low++;
            }
            cnt += high - low;
        }
        return cnt;
    }

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int minDistance = 0;
        int maxDistance = nums[nums.length - 1] - nums[0];

        while (minDistance < maxDistance) {
            int midDistance = minDistance + (maxDistance - minDistance) / 2;
            int pair = f(nums, midDistance);

            if (pair < k)
                minDistance = midDistance + 1;
            else
                maxDistance = midDistance;
        }
        return minDistance;
    }
}