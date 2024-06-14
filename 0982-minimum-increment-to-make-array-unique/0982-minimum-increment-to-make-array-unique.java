class Solution {
    public int minIncrementForUnique(int[] nums) {
       int[] freq = new int[100002];
       for(int i=0;i<nums.length;i++){
              freq[nums[i]]++;
       }
      int cnt=0;
       for(int i=0;i<100001;i++){
        if(freq[i]>1){
           cnt +=freq[i]-1; 
           freq[i+1]+=freq[i]-1;
        }
       }
       if(freq[100001]>1){
        cnt+= (freq[100001]-1)*((freq[100001]-1)+1)/2;
       }
       return cnt;
    }
}