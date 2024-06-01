class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis) {
        vis[src] = true;

        for (int it : adj.get(src)) {
            if (vis[it] == false) {
                dfs(adj, it, vis);
            }
        }
    }

    public int findCircleNum(int[][] mat) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        int v = mat.length;

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (i == j)
                    continue;
                if (mat[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] vis = new boolean[v];
        int res = 0;
        for (int i = 0; i < v; i++) {
            if (vis[i] == false) {
                dfs(adj, i, vis);
                res++;
            }
        }
        return res;
    }
}