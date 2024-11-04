class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String comp = strs[0];
        int end = comp.length();

        for (int i = 1; i < n; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < end; j++) {
                if (strs[i].charAt(j) != comp.charAt(j)) {
                    end = j;
                    break;
                }
            }
            if (j == strs[i].length())end = j;
        }

        return comp.substring(0, end);
    }
}