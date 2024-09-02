class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long reqChalk =0;

        for(int it:chalk){
            reqChalk+=it;
        }
        int remChalk =(int)(k%reqChalk);

        for(int i=0;i<chalk.length;i++){
            if(remChalk< chalk[i])return i;
            remChalk -=chalk[i];
        }
        return -1;
    }
}