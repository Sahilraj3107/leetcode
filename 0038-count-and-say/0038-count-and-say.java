class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        StringBuilder str = new StringBuilder("1");

        for (int k = 1; k < n; k++) {
            int cnt = 1;
            String temp = "";
            char ch = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (ch == curr)
                    cnt++;
                else {
                    String num = Integer.toString(cnt);
                    temp = temp + num + ch;
                    ch = curr;
                    cnt = 1;
                }
            }
            String num = Integer.toString(cnt);
            temp = temp + num + ch;
            str = new StringBuilder(temp);
        }
        return str.toString();
    }
}