class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length, m = queries.length;
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {
            char strt = words[i].charAt(0), end = words[i].charAt(words[i].length() - 1);
            boolean l = false, h = false;
            if (strt == 'a' || strt == 'e' || strt == 'i' || strt == 'o' || strt == 'u')
                l = true;
            if (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u')
                h = true;

            prefix[i] = (l && h) ? 1 : 0;
            if (i > 0)
                prefix[i] += prefix[i - 1];
        }

        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int h = queries[i][1];
            ans[i] = (prefix[h] - (l > 0 ? prefix[l - 1] : 0));
        }
        return ans;
    }
}