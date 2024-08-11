class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r=0,c=0;

        for(String i: commands){
            if(i.equals("UP"))r--;
            else if(i.equals("DOWN"))r++;
            else if(i.equals("RIGHT"))c++;
            else c--;
            // System.out.print(i+" ");
        }

        return ((r*n) + c);
    }
}