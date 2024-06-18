class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = profit.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, difficulty[i]);
        }
        int m = max + 1;
        int[] maxDifficulty = new int[m];
        for (int i = 0; i < n; i++) {
            maxDifficulty[difficulty[i]] = Math.max( maxDifficulty[difficulty[i]], profit[i]);
        }

        max = maxDifficulty[0];
        for (int i = 1; i < m; i++) {
            max = Math.max(max, maxDifficulty[i]);
            maxDifficulty[i] = max;
        }

        int maxProfit = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] > (m - 1))
                maxProfit += maxDifficulty[m - 1];
            else
                maxProfit += maxDifficulty[worker[i]];
        }
        return maxProfit;
    }
}