class NumMatrix {
    int[][] matrix;
    
    public NumMatrix(int[][] matrix) {
        this.matrix =matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        long sum =0;
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                sum += matrix[i][j];
            }
        }
        return (int)sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */