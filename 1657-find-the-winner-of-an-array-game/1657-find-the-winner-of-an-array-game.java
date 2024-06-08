class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length , ind=0, curr=0;    

        for(int i=1;i<n;i++){
            if(arr[i]>arr[ind]){
                curr=0;
                ind=i;
            }
            if(++curr>=k)break;
        }
        return arr[ind];
    }
}