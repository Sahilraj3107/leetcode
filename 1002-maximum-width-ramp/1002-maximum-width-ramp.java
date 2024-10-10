class Solution {
    public int maxWidthRamp(int[] nums) {
       int n=nums.length;
       Stack<Integer> stk =new Stack<>();

       for(int i=0;i<n;i++){
        if(stk.isEmpty() || nums[stk.peek()]>nums[i]){
         stk.push(i);
        }
       }

       int maxWidth =0;

       for(int i=(n-1);i>=0;i--){
        while(!stk.isEmpty() && nums[i]>=nums[stk.peek()]){
            maxWidth =Math.max(maxWidth,(i-stk.pop()));
        }
       }
       return maxWidth;
    }
}