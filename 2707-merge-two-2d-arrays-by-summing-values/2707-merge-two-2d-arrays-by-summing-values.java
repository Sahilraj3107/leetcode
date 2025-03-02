class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length, m = nums2.length;
        List<int[]> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                mergedList.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                mergedList.add(nums1[i]);
                i++;
            } else {
                mergedList.add(nums2[j]);
                j++;
            }
        }
        while (i < nums1.length) {
            mergedList.add(nums1[i++]);
        }

        while (j < nums2.length) {
            mergedList.add(nums2[j++]);
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}