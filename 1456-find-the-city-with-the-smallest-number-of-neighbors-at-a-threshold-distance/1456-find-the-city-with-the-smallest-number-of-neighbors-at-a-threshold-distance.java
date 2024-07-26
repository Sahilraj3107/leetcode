
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
            distance[i][i] = 0;
        }

        for (int i = 0; i < edges.length; i++) {
            distance[edges[i][0]][edges[i][1]] = edges[i][2];
            distance[edges[i][1]][edges[i][0]] = edges[i][2];
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distance[i][k] != Integer.MAX_VALUE && distance[k][j] != Integer.MAX_VALUE) {
    distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE, ans = -1;
       
       for(int i=0;i<n;i++){
        int src =0;
        for(int j=0;j<n;j++){
            if(i!=j && distance[i][j]<=distanceThreshold){
                src++;
            }
        }
        if(src<=min){
            min =src;
            ans =i;
        }
       }
       return ans;
    }
}
