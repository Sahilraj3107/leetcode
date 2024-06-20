class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int end =position[position.length-1]-position[0];
        int start =1;
        int ans =1;

        while(start<=end){
            int mid =start +(end-start)/2;
            if(isPossible(mid, position, m)) {
                ans =mid;
                start = mid +1;
            }
            else end =mid-1;
        }
        return ans;
    }

    private boolean isPossible(int mid, int[] position, int m){
        int prev =position[0];
        m--;

        for(int i=1;i<position.length;i++){
            if(position[i]-prev >=mid){
                m--;
                prev =position[i];
            }
            if(m==0)return true;
        }
        return false;
    }
}