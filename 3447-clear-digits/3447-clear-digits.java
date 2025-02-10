class Solution {
    public String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public String clearDigits(String s) {
        int n = s.length(), cnt = 0;
        String ans = "";

        for (int i = (n - 1); i >= 0; i--) {
            int num = s.charAt(i) - '0';
            if (num >= 0 && num < 10)
                cnt++;
            else if (cnt > 0)
                cnt--;
            else {
                ans = ans + s.charAt(i);
            }
        }
        return reverse(ans);
    }
}