class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> list =new ArrayList<>();
        
        int mod =1000000007;
        int l=0,r=0;
        long sum =0;
        while(r<n){
          sum += nums[r]%mod;
          sum =sum%mod;
          list.add(sum);
          r++;
          if(r==n && l<(n-1)){
            l++;
            r=l;
            sum=0;
          }
        }

        sum=0;
        Collections.sort(list);
        for(int i=left;i<=right;i++){
            sum+=list.get(i-1)%mod;
            sum =sum%mod;
        }
        return (int)sum%mod;
    }
}