class Solution {
     private int helper(int[] piles, boolean isEven)
    {
        int i = (isEven) ? 0 : 1;

        int total = 0;
        for(; i < piles.length; i += 2)
        {
            total += piles[i];
        }

        return total;
    } 
    public boolean stoneGame(int[] piles) {
          int evenSum = helper(piles, true);
        int oddSum = helper(piles, false);

        return (evenSum > oddSum) ? true : true; 
    }
}
