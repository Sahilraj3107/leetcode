class Solution {
    public int maxVowels(String s, int k) {
        long cnt = 0;
        int l = 0, r = 0, n = s.length();
        long res = 0;
        while (r < n) {
            char high = s.charAt(r);
            char low = s.charAt(l);
            if ((r - l + 1) > k) {
                if (low == 'a' || low == 'e' || low == 'i' || low == 'o' || low == 'u') {
                    cnt--;
                }
                l++;
            }
            if ((r - l + 1) <= k) {
                if (high == 'a' || high == 'e' || high == 'i' || high == 'o' || high == 'u') {
                    cnt++;
                }
            }
            res = Math.max(res, cnt);
            r++;
        }
        return (int) res;
    }
}