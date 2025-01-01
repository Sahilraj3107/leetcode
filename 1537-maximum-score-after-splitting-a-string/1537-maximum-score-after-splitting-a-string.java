class Solution {
    public int maxScore(String s) {

        int one = 0, zero = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1')
                one++;
        }

        int max = 0;

        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            if (ch == '0')
                zero++;
            else
                one--;
            max = Math.max(max, (zero + one));
        }
        return max;
    }
}