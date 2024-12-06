class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] arr =new boolean[n+1];
        
        for(int i=0;i<banned.length;i++){
            if(banned[i]<=n)arr[banned[i]]=true;
        }

        int cnt =0, sum=0;
        for(int i=1;i<=n;i++){
            if(arr[i]==false && (sum +i)<=maxSum){
                cnt++;
                sum +=i;
            }
        }
        return cnt;
    }
}