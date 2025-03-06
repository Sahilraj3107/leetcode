class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[] freq = new boolean[n*n +1];
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (freq[grid[i][j]] == true)
                    ans[0] = grid[i][j];
               freq[grid[i][j]]=true;     
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (freq[i]==false) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}