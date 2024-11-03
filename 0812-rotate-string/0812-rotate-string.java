class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        StringBuilder str = new StringBuilder(s);
        StringBuilder target = new StringBuilder(goal);

        int n = s.length();

        while (n-- > 0) {
            if (str.toString().equals(target.toString()))
                return true;
            char leftmost = str.charAt(0);
            str.deleteCharAt(0);
            str.insert(str.length(), leftmost);
        }
        return false;
    }
}