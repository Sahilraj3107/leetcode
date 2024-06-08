class Solution {
    public boolean canFinish(int v, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[v];
        Arrays.fill(indegree, 0);
        for (int i = 0; i < prerequisites.length; i++) {
            int x = prerequisites[i][0];
            int y = prerequisites[i][1];
            adj.get(y).add(x);
            indegree[x]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int cnt = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            cnt++;
            for (int it : adj.get(node)) {
                if (indegree[it] == 0)
                    continue;
                indegree[it]--;
                if (indegree[it] == 0)
                    q.add(it);
            }
        }
        return v == cnt;
    }
}