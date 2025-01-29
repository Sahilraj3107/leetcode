class Solution {
     public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map =new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            char ch =magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char ch =ransomNote.charAt(i);
            if(!map.containsKey(ch))return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0)map.remove(ch);
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int ans=0;

        for(int i=0;i<words.length;i++){
            if(canConstruct(words[i],chars))ans +=words[i].length();
        }
        return ans;
    }
}