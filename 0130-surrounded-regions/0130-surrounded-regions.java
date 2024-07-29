class Solution {
    public void dfs(char[][] board, int i,int j){
        board[i][j]='Y';
        int[] delr ={-1,0,1,0};
        int[] delc ={0,-1,0,1};

        for(int k=0;k<4;k++){
            int r =delr[k] +i;
            int c =delc[k] +j;

            if(r>=0 && r<board.length && c>=0 && c<board[0].length && board[r][c]=='O')dfs(board,r,c);
        }
    }
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    if (board[i][j] == 'O')
                        dfs(board, i, j);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='Y')board[i][j]='O';
                else board[i][j]='X';
            }
        }
    }
}