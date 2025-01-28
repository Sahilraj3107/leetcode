class Solution {
    public int f(int[][] grid, int n, int m, int row, int col, boolean[][] vis) {
        if (row < 0 || row >= n)
            return 0;
        if (col < 0 || col >= m)
            return 0;
        if (vis[row][col] == true || grid[row][col] == 0)
            return 0;

        vis[row][col] = true;
        int right = f(grid, n, m, row, col + 1, vis);
        int left = f(grid, n, m, row, col - 1, vis);
        int up = f(grid, n, m, row - 1, col, vis);
        int down = f(grid, n, m, row + 1, col, vis);

        return (grid[row][col] + right + left + up + down);
    }

    public int findMaxFish(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0 && vis[i][j] == false) {
                    int calFish = f(grid, n, m, i, j, vis);
                    maxi = Math.max(maxi, calFish);
                }
            }
        }
        return maxi;
    }
}