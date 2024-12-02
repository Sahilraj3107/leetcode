class Solution {
    public int prefixCount(String[] str, String searchWord) {

        int cnt =0;
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=searchWord.length()){
                if(searchWord.equals(str[i].substring(0, searchWord.length())))
                       cnt++;
            }     
        }
        return cnt;
    }
}