class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) { 
            return Integer.MAX_VALUE; 
        }

        
        boolean isNegative = (dividend < 0) ^ (divisor < 0); 

        
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int quotient = 0;

       
        while (absDividend >= absDivisor) {
            long currentDivisor = absDivisor;
            int multiple = 1;

            
            while (absDividend >= (currentDivisor << 1)) {
                currentDivisor <<= 1;
                multiple <<= 1;
            }

            absDividend -= currentDivisor;
            quotient += multiple;
        }

      
        return isNegative ? -quotient : quotient;
    }
}