class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        Map<Character, Integer> mpp = new HashMap<>();

        for (int i = 0; i < m; i++)
            mpp.put(t.charAt(i), mpp.getOrDefault(t.charAt(i), 0) + 1);
        
        int l=0, r=0, cnt =0, minLen=(int)(1e9), startInd=-1;

        while(r<n){
           
           if(mpp.containsKey(s.charAt(r)) && mpp.get(s.charAt(r))>0)cnt++;
           mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) - 1);
           
           while(cnt==m){
            if((r-l+1)<minLen){
                minLen =(r-l+1);
                startInd =l;
            }
             mpp.put(s.charAt(l), mpp.getOrDefault(s.charAt(l), 0) + 1);
             if(mpp.get(s.charAt(l))>0)cnt--;
             l++;
           }
          r++;
        }

        if(startInd ==-1)return "";
 return s.substring(startInd,startInd+minLen);
    }
}