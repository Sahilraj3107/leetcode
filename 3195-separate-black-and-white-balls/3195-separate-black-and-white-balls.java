class Solution {
    public long minimumSteps(String s) {
        char[] ch =s.toCharArray();

        int idx =ch.length-1, n=ch.length;
        long minStep =0;

        for(int i=(n-1);i>=0;i--){
         if(ch[i]=='1'){
           minStep += (idx-i);
            idx =idx-1;
         }
        }
       
 return minStep;
    }
}