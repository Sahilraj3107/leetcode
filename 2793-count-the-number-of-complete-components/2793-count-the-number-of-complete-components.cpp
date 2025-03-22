class Solution {
public:
    void dfs(int src,vector<bool>& vis,vector<vector<int>>& adj, vector<int>& path){
        vis[src]=true;
        path.push_back(src);
        for(auto it : adj[src]){
           if(vis[it]==false)dfs(it,vis,adj,path);
        }
    }
    int countCompleteComponents(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj;

        for(int i=0;i<n;i++){
          adj.push_back(vector<int>());
        }

        for(int i=0;i<edges.size();i++){
            int u =edges[i][0], v =edges[i][1];
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        vector<bool> vis(n,false);
        int ans =0;

        for(int i=0;i<n;i++){
            if(vis[i]==false){
                vector<int> path;
                dfs(i,vis,adj,path);
                bool iscomp=true;

                for(auto it: path){
                    if(adj[it].size()!=path.size()-1){
                        iscomp =false;
                        break;
                    }
                }
                if(iscomp)ans++;
            }
        }
    return ans;
    }
};