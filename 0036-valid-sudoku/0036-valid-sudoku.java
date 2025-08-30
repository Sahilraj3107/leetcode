class Solution {
    public boolean isValidSudoku(char[][] board) {
         Set s=new HashSet();
      for(int i=0;i<9;++i){
          for(int j=0;j<9;++j){
              if(board[i] [j] != '.'){
                  String a="("+board[i][j]+")";
                  if(!s.add(a+i) || !s.add(j+a) || !s.add(i/3 +a+j/3)){
                      return false;
                  }
              }
          }
      }
      return true;
    }
}