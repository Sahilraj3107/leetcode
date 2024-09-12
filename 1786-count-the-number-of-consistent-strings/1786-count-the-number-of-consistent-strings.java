class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> set= new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
         long cnt=0;
        for(int i=0;i<words.length;i++){
            boolean flag =true;
            for(int j=0;j<words[i].length();j++){
                   if(!set.contains(words[i].charAt(j))){
                    flag =false;
                    break;
                   }
            }
            if(flag)cnt++;
        }
        return (int)cnt;
    }
}