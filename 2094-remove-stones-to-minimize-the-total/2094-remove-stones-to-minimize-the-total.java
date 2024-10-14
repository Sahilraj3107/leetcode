class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:piles)pq.offer(num);
        
        while(!pq.isEmpty() && k!=0){
           int top =pq.poll();
           top -=top/2;
           pq.offer(top);
           k--;
        }

        long minStone=0;
        while(!pq.isEmpty()){
            minStone +=pq.poll();
        }
        return (int)minStone;
    }
}