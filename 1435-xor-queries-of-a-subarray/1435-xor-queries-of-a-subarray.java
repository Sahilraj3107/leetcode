class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] pre =new int[arr.length];
        pre[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]^arr[i];
        }

        int[] res =new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int low =queries[i][0];
            int high =queries[i][1];
            if(low==0){
                res[i]=pre[high];
            }
            else{
                res[i]=pre[high]^pre[low-1];
            }
        }
        return res;
    }
}