class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis, boolean[] pathVis,
            List<Integer> res) {
        vis[src] = true;
        pathVis[src] = true;

        for (int it : adj.get(src)) {
            if (!vis[it]) {
                if (dfs(adj, it, vis, pathVis, res))
                    return true;
            } else if (pathVis[it] == true)
                return true;
        }

        res.add(src);
        pathVis[src] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int v = graph.length;
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(i).add(graph[i][j]);
            }
        }
        boolean[] vis = new boolean[v];
        boolean[] pathVis = new boolean[v];
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            if (vis[i] == false)
                dfs(adj, i, vis, pathVis, res);
        }
        Collections.sort(res);
        return res;
    }
}