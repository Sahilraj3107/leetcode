class Solution {
    public int minOperations(int[] nums) {
        boolean flag =false;
        int n =nums.length;

        int cnt=0;
        for(int i=0;i<n;i++){
            if(flag && nums[i]==1){
                cnt++;
                nums[i]=1;
                flag=!flag;
            }
            else if(!flag && nums[i]==0){
                 cnt++;
                nums[i]=1;
                flag=!flag;
            }
            else if( flag && nums[i]==0)nums[i]=1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]==0)return -1;
        }
        return cnt;
    }
}