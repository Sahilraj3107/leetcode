class Solution {
    public int minimumChairs(String s) {
        int minSeat=0;
        int free=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='E'){
                if(free==0){
                    minSeat++;
                }
                else free--;
            }
            else free++;
        }
        return minSeat;
    }
}