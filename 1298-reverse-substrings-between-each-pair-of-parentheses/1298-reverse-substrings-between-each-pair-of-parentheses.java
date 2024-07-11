class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> ind = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                ind.push(res.length());
            } else if (ch == ')') {
                int start = ind.pop();
                String rev = new StringBuilder(res.substring(start)).reverse().toString();
                res.replace(start, res.length(), rev);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}