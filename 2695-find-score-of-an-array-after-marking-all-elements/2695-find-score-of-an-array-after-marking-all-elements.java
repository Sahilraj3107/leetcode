class Pair {
    int first;
    int second;

     Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public long findScore(int[] nums) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first) return Integer.compare(a.first, b.first);
            return Integer.compare(a.second, b.second);
        });
        for (int i = 0; i < nums.length; i++)
            pq.offer(new Pair(nums[i], i));

        boolean[] markIdx = new boolean[nums.length];
        long score = 0;

        while (!pq.isEmpty()) {
            int numb = pq.peek().first;
            int idx = pq.peek().second;
            if (markIdx[idx] == false) {
                score += numb;
                markIdx[idx] = true;
                if (idx > 0)
                    markIdx[idx - 1] = true;
                if (idx < nums.length - 1)
                    markIdx[idx + 1] = true;
            }
            pq.poll();
        }
        return score;
    }
}