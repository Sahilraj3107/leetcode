class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            int[][] res =new int[0][0];
            return res;
        }
            int[][] res =new int[m][n];
       int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=original[k++];
            }
        }
        return res;
    }
}