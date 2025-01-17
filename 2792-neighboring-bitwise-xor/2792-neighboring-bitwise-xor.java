class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n =derived.length;
       

        boolean init =true, trav=true;

        for(int i=0;i<n-1;i++){
            if(derived[i]==1)trav =!trav;
        }
        if(derived[n-1]==0 &&init ==trav)return true;
        else if(derived[n-1]==1 &&init !=trav)return true;
        else return false;
      

    }
}