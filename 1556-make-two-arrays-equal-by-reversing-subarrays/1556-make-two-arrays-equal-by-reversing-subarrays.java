class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> mpp =new HashMap<>();
        for(int i=0;i<target.length;i++){
            mpp.put(target[i], mpp.getOrDefault(target[i],0)+1);
        }
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(mpp.containsKey(arr[i])){
                mpp.put(arr[i],mpp.get(arr[i])-1);
                if(mpp.get(arr[i])==0)mpp.remove(arr[i]);
            }
            else cnt++;
        }
        if(mpp.size()==0 && cnt==0)return true;
        else return false;
    }
}