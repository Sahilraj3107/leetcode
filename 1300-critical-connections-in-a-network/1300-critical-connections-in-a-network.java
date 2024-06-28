class Solution {
   private int timer =1;
    public void dfs(int node, int parent, boolean[] vis,ArrayList<ArrayList<Integer>> adj, int[] low,int[] tin,List<List<Integer>> bridges){
     vis[node]=true;
     low[node]=tin[node]=timer;
     timer++;

     for(int it: adj.get(node)){
        if(it == parent)continue;
        if(!vis[it]){
            dfs(it, node,vis,adj,low, tin,bridges);
            low[node]=Math.min(low[node],low[it]);

            if(low[it]>tin[node]) bridges.add(Arrays.asList(it, node));
        }
        else low[node]=Math.min(low[node],low[it]);
     }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(List<Integer> it: connections){
         int u=it.get(0), v=it.get(1);
         adj.get(u).add(v);
         adj.get(v).add(u);
        }

        boolean[] vis =new boolean[n];
        int[] low=new int[n];
        int[] tin =new int[n];
        List<List<Integer>> bridges =new ArrayList<>();
        dfs(0,-1,vis,adj,low,tin, bridges);
        return bridges;
    }
}