class Solution {
    public long countCompleteDayPairs(int[] hours) {
        Map<Integer, Integer> mpp = new HashMap<>();
        long count = 0;
        
        for (int hour : hours) {
            int remainder = hour % 24;
            int complement = (24 - remainder) % 24;
            
            if (mpp.containsKey(complement)) {
                count += mpp.get(complement);
            }
            
            mpp.put(remainder,mpp.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}