class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1, b = -1, c = -1, cnt = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                a = i;
            if (s.charAt(i) == 'b')
                b = i;
            if (s.charAt(i) == 'c')
                c = i;
            if (a != -1 && b != -1 && c != -1) {
                cnt += Math.min(a, Math.min(b, c)) + 1;
            }
        }
        return cnt;
    }
}