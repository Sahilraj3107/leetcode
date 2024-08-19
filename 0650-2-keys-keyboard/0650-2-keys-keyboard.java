class Solution {
    public int minSteps(int n) {
        if(n==1)return 0;

        int res=0, fact=2;
        
        while(n>1){
            while(n%fact==0){
                res+=fact;
                n=n/fact;
            }
            fact++;
        }
        return res;
    }
}