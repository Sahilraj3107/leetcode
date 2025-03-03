class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n =nums.length;
        int[] arr =new int[n];
        int i=0, cnt=0;
        for(int num:nums){
            if(num<pivot)arr[i++]=num;
            else if(num==pivot)cnt++;
        }
        while(cnt-->0)arr[i++]=pivot;
        for(int num:nums){
            if(num>pivot)arr[i++]=num;
        }
        return arr;
    }
}