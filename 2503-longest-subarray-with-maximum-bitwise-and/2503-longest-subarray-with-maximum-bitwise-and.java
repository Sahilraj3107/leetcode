class Solution {
    public int longestSubarray(int[] nums) {
    
    int max =Integer.MIN_VALUE;

    for(int num:nums){
        max =Math.max(num,max);
    }
    
    int tempLen =0,len=0;
    for(int num:nums){
        if(num==max){
            tempLen++;
        }
        else {
            len =Math.max(len,tempLen);
            tempLen =0;
        }
    }
      len =Math.max(tempLen,len);
      return len;
    }
}