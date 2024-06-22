class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n =nums.length;

        int[] arr =new int[n+1];
        arr[0]=1;

        int ans =0, x =0;
        for(int v: nums) {
            x += v & 1;
            if((x-k)>=0)ans+= arr[x-k];
            arr[x]++;
        }
        return ans;
    }
}