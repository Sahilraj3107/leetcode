class Solution {
    public long pickGifts(int[] gifts, int k) {
     
PriorityQueue<Integer> pq =new PriorityQueue<>(new Comparator<Integer>(){
      public int compare(Integer a,Integer b){
        return b-a;
      }
     });
    
     for(int num :gifts)pq.offer(num);

   while(k>0 && pq.peek()>0){
    int maxPile =pq.poll();
    pq.offer((int)Math.sqrt(maxPile));
    k--;
   }
   long remGift =0;
   while(!pq.isEmpty()){
    remGift += pq.poll();
   }
     return remGift;
    }
}