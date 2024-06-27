class Solution {
    public int findCenter(int[][] edges) {
        
        int n =edges.length+1;
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        
        for(int i=0;i<n+1;i++){
           adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x =edges[i][0];
            int y=edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        for(int i=0;i<n+1;i++){
            if(adj.get(i).size()==(n-1))return i;
        }
        return -1;
    }
}