class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] distance = new int[26][26];

        for (int i = 0; i < 26; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
            distance[i][i] = 0;
        }

        for (int i = 0; i < cost.length; i++) {
            distance[original[i] - 'a'][changed[i] - 'a'] = Math.min(distance[original[i] - 'a'][changed[i] - 'a'],
                    cost[i]);
        }

        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                if (distance[i][k] < Integer.MAX_VALUE) {
                    for (int j = 0; j < 26; j++) {
                        if (distance[k][j] < Integer.MAX_VALUE) {
                            distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                        }
                    }
                }
            }
        }

        long ans = 0L;
        for (int i = 0; i < source.length(); i++) {
            int ch1 = source.charAt(i) - 'a';
            int ch2 = target.charAt(i) - 'a';
            if (distance[ch1][ch2] == Integer.MAX_VALUE)
                return -1L;
            else
                ans += (long) distance[ch1][ch2];
        }
        return ans;

    }
}