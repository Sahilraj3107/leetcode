class Solution {
    public int passThePillow(int n, int time) {
        if(n==1)return n;
        if(time<n)return time +1;
        // if(time%n==0) return time - 1;
        int x =time/(n-1);
        if(x%2==0){
            return time%(n-1) +1;
        }
        else return n-time%(n-1);
    }
}