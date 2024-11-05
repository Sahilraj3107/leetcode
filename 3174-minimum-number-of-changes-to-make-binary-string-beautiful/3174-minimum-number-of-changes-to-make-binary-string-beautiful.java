class Solution {
    public int minChanges(String s) {
        int cnt=0;

        for(int j=1;j<s.length();j=j+2){
             if(s.charAt(j)!=s.charAt(j-1))cnt++;
        }
        return cnt;
    }
}