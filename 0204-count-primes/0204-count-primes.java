class Solution {
    public int countPrimes(int n) {
        if (n <= 1)
            return 0;
        boolean[] arr = new boolean[n];
        long cnt = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i] == false) {
                cnt++;
                int k = 1, j = i;
                while (j < n) {
                    arr[j] = true;
                    k++;
                    j = i * k;
                }
            }
        }
        return (int) cnt;
    }
}