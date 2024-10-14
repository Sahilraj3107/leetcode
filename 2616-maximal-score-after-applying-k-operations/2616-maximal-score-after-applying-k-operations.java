class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());

        for(int num: nums){
            pq.offer(num);
        }

       long score =0;
        
        while(k!=0){
            int top =pq.poll();
            score +=top;

            if(top%3==0)top =top/3;
            else top =top/3 +1;

            pq.offer(top);
            k--;
           
        }

        return score;
    }
}