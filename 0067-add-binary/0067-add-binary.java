class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int n = a.length() - 1, m = b.length() - 1, carry = 0;

        while (n >= 0 || m >= 0 || carry > 0) {
            int ch1 = (n >= 0) ? a.charAt(n--) - '0' : 0;
            int ch2 = (m >= 0) ? b.charAt(m--) - '0' : 0;

            int sum = ch1 + ch2 + carry;
            str.append(sum % 2);  
            carry = sum / 2;     
        }

        return str.reverse().toString(); 
    }
}
