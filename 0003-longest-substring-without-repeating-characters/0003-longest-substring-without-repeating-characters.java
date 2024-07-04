class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, max = 0;
        Map<Character, Integer> mpp = new HashMap<>();

        while (r < n) {

            if (mpp.containsKey(s.charAt(r))) {
                l = Math.max(l, mpp.get(s.charAt(r)) + 1);
            }
            mpp.put(s.charAt(r), r);
            max = Math.max(max, (r - l + 1));
            r++;
        }
        return max;
    }
}