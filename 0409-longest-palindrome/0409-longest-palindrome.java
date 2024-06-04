class Solution {
    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int one = 0;
        int res = 0;

        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if (en.getValue() % 2 == 0)
                res += en.getValue();
            else {
             res+=en.getValue()-1;
             one++;
            }    
        }
        if (one > 0)
            res += 1;
        return res;
    }
}