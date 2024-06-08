class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n=skills.length; 
        int ind_ =0;
        int curr=0;
        for(int i=1;i<n;i++){
           if(skills[i]>skills[ind_]){
            curr=0;
            ind_ =i;
           }
          if(++curr >=k)break;
        }
      
        return ind_;
    }
}