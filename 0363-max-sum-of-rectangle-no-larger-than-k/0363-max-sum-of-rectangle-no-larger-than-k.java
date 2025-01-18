import java.util.*;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int top = 0; top < n; top++) {
            int[] rowSum = new int[m]; 

            for (int bottom = top; bottom < n; bottom++) {
                
                for (int col = 0; col < m; col++) {
                    rowSum[col] += matrix[bottom][col];
                }

              
                maxSum = Math.max(maxSum, maxSubarraySumLessThanK(rowSum, k));
            }
        }

        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }

   
    private int maxSubarraySumLessThanK(int[] arr, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);  
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;
            Integer target = set.ceiling(currentSum - k);
            if (target != null) {
                maxSum = Math.max(maxSum, currentSum - target);
            }
            set.add(currentSum);
        }

        return maxSum;
    }

}
