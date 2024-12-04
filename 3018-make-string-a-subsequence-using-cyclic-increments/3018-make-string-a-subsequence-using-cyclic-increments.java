class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0, j=0, n =str1.length(),m=str2.length();

        while(i<n && j<m){
            int ch1 =(str1.charAt(i)-'a');
            int ch2 =(str2.charAt(j)-'a');
            if(ch1 == ch2 || (ch1+1)%26 ==ch2){
                j++;
            }
            i++;
        }
        if(j==m)return true;
        return false;
    }
}