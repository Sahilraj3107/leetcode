class Solution {
    private static int roundTo32BitRange(long num) {
        
        int min = -(1 << 31);      
        int max = (1 << 31) - 1;  

        if (num < min) {
            return min;
        } else if (num > max) {
            return max;
        }
        return (int) num;
    }

    public int myAtoi(String str) {
        String s = str.trim();
        if (s.length() == 0)
            return 0;
        
        long ans = 0;
        int i = 0;
        boolean neg = false;


        if (s.charAt(0) == '-') {
            neg = true;
            i = 1;
        } else if (s.charAt(0) == '+') {
            i = 1;
        }

        // Parse each character until we encounter a non-digit
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }
            int num = ch - '0';
            ans = ans * 10 + num;

            // If ans exceeds the max range during calculation, stop early
            if (ans > Integer.MAX_VALUE) {
                break;
            }
        }

        // Apply the negative sign if necessary
        if (neg) {
            ans = -ans;
        }

        // Round the result to stay within the 32-bit integer range
        return roundTo32BitRange(ans);
    }
}
