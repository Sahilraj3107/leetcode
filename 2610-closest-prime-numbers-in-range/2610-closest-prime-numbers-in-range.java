import java.util.*;

class Solution {
    public void sieve(boolean[] prime) {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false; // 0 and 1 are not primes

        for (int p = 2; p * p < prime.length; p++) {
            if (prime[p]) {
                for (int i = p * p; i < prime.length; i += p)
                    prime[i] = false;
            }
        }
    }

    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right + 1];
        sieve(prime);

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }

        if (list.size() < 2) {
            return new int[]{-1, -1}; // No valid pair
        }

        int minDiff = Integer.MAX_VALUE;
        int[] ans = new int[2];

        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = list.get(i - 1);
                ans[1] = list.get(i);
            }
        }

        return ans;
    }
}
