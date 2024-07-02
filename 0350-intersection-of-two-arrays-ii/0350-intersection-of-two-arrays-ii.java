class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            mpp.put(nums1[i], mpp.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (mpp.containsKey(nums2[i])) {
                list.add(nums2[i]);
                mpp.put(nums2[i], mpp.get(nums2[i]) - 1);
                if (mpp.get(nums2[i]) == 0)
                    mpp.remove(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        int j = 0;
        for (int x : list) {
            res[j++] = x;
        }
        return res;
    }
}