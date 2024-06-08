class Solution {
    public String clearDigits(String s) {
        int cnt=0;
        StringBuilder res=new StringBuilder("");
        int n =s.length();

        for(int i=(n-1);i>=0;i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                cnt++;
            }
            else if(cnt>0)cnt--;
            else res.insert(0,s.charAt(i)); 
        }
        return res.toString();
    }
}