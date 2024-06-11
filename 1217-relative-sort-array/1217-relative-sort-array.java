class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int[] res = new int[n];
        boolean[] vis = new boolean[1001];
        int j = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(arr2[i])) {
                int size = map.get(arr2[i]);
                vis[arr2[i]] = true;
                for (int k = 0; k < size; k++) {
                    res[j++] = arr2[i];
                }
            }
        }
        Arrays.sort(arr1);
        for (int i = 0; i < n; i++) {
            if (vis[arr1[i]] == false)
                res[j++] = arr1[i];
        }
        return res;
    }
}