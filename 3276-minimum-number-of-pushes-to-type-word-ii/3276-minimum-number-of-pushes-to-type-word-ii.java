class Pair implements Comparable<Pair> {
    int first;
    char second;

    Pair(int first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(o.first, this.first); 
    }
}

class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> mpp = new HashMap<>();
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> en : mpp.entrySet()) {
            pq.offer(new Pair(en.getValue(), en.getKey()));
        }

        int cnt1 = 0, cnt2 = 0, cnt3 = 0, res = 0;
        while (!pq.isEmpty()) {
            int val = pq.peek().first;
            pq.poll();
            if (cnt1 < 8) {
                cnt1++;
                res += val;
            } else if (cnt2 < 8) {
                cnt2++;
                res += 2 * val;
            } else if (cnt3 < 8) {
                cnt3++;
                res += 3 * val;
            } else {
                res += 4 * val;
            }
        }

        return res;

    }
}