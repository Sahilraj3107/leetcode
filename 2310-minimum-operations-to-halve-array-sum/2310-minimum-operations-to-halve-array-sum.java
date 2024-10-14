class Solution {
    public int halveArray(int[] nums) {
        double sum =0;
        PriorityQueue<Double> pq =new PriorityQueue<>(Collections.reverseOrder());

        for(int num: nums){
            sum +=(double) num;
            pq.offer((double)num);
        }
       double temp =sum;
       long cnt=0;

       while(temp>sum/2){
        double curr =pq.poll();
        curr =curr/2;
        temp -=curr;
        pq.offer(curr);
        cnt++;
       }
       
        return (int)cnt;

    }
}