class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n =nums.length;
        int max = (1<<maximumBit)-1;

        int[] prefixXOR =new int[n];
        prefixXOR[0] =nums[0];

        for(int i=1;i<n;i++) {
            prefixXOR[i] = nums[i]^prefixXOR[i-1];
            }
        
        for(int i=0;i<n;i++) {
            prefixXOR[i] = prefixXOR[i]^max;
            }    
        
        int[] answer =new int[n];
        for(int i=0;i<n;i++){
            answer[i] =prefixXOR[n-i-1];
        }
        return answer;

    }
}