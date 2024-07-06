class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> mpp = new HashMap<>();
        int l = 0, r = 0, maxLen = 0, maxFreq = 0;

        while (r < s.length()) {
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, mpp.get(s.charAt(r)));

            if ((r - l + 1) - maxFreq > k) {
                mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);
                maxFreq = Math.max(maxFreq, mpp.get(s.charAt(l)));
                if (mpp.get(s.charAt(l)) == 0)
                    mpp.remove(s.charAt(l));
                l++;
            }

            if ((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, (r - l + 1));
            }
            r++;
        }
        return maxLen;
    }
}