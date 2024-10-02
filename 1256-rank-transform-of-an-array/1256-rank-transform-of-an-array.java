class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
         TreeSet<Integer> nums = new TreeSet<>();
        for (int num : arr) {
                nums.add(num);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int rank=1;
        for (int num:nums) {
            map.put(num, rank++);
        }

        int[] res = new int[n];
        int i = 0;
        for (int num : arr) {
            res[i++] = map.get(num);
        }
        return res;
    }
}