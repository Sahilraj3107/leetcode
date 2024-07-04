class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0, r=0, maxLen =0, n =nums.length;
        Queue<Integer> index =new LinkedList<>();
        int zero =0;

        while(r<n){
            if(nums[r]==0){
                index.add(r);
                zero++;
               if(zero>k){
                l = index.poll() +1;
                zero--;
               }
            }
            maxLen =Math.max(maxLen, (r-l+1));
            r++;
        }
      return maxLen;
    }
}