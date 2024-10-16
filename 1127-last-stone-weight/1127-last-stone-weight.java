class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones)
            pq.offer(stone);

        while (pq.size() >= 2) {
            int y = pq.poll(), x = pq.poll();
            if (x != y) {
                y -= x;
                pq.offer(y);
            }

        }
        if (pq.size() == 0)
            return 0;
        return pq.peek();
    }
}