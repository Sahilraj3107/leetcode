class Solution {
    public long maximumTotalDamage(int[] power) {
         Map<Integer, Integer> mpp = new HashMap<>();
        for (int pow : power) mpp.put(pow, mpp.getOrDefault(pow, 0) + 1);
        

        List<Integer> list = new ArrayList<>(mpp.keySet());
        Collections.sort(list);

        
        int cnt = list.size();
        if (cnt == 1) {
            return (long) list.get(0) * mpp.get(list.get(0));
        }

        long[] dp = new long[cnt+1];

      
        for (int i = 1; i <= cnt; i++) {
            long currentDamage = (long) list.get(i - 1) * mpp.get(list.get(i - 1));
            long pick = currentDamage;

            for (int j =i-2;j>= 0;j--) {
                if (list.get(i - 1) -list.get(j) > 2) {
                    pick += dp[j + 1];
                    break;
                }
            }

            long notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }

      
        return dp[cnt];
    }
}