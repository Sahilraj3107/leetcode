class Solution {
    public int minSwaps(String s) {
        int ans = 0;
        int close = 0, open = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ']') {
                if (close >= open || open==0) {
                    ans++;
                    open++;
                } else
                    close++;
            } else
                open++;
        }
        return ans;
    }
}