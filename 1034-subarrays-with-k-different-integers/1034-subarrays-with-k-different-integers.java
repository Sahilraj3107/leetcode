class Solution {
    public int f(int[] arr, int goal){
        int l=0, r=0,cnt=0, n=arr.length;
        Map<Integer, Integer> mpp =new HashMap<>();

        while(r<n){
            mpp.put(arr[r], mpp.getOrDefault(arr[r],0)+1);

            while(mpp.size()>goal){
                 mpp.put(arr[l], mpp.get(arr[l])-1);
                 if(mpp.get(arr[l])==0)mpp.remove(arr[l]);
                 l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int cnt1 =f(nums, k);
        int cnt2 =f(nums, k-1);

        return (cnt1-cnt2);
    }
}