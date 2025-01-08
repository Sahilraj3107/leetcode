class Solution {
    public boolean isPrefixAndSuffix(String a, String b){
        if(a.length()>b.length())return false;
        int n =b.length(), m=a.length();
        if(!a.equals(b.substring(0,m)))return false;

        if(!a.equals(b.substring(n-m)))return false;
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int cnt =0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j]))cnt++;
            }
        }
        return cnt;
    }
}