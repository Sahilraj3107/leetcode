class Solution {
    public int countSeniors(String[] details) {
        
        int cnt=0;
        for(int i=0;i<details.length;i++){
            int str =  Integer.valueOf(details[i].substring(11,13));
            if(str>60)cnt++;
        }
        return cnt;
    }
}