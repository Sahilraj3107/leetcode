class Solution {
    public int maxArea(int[] height) {

        int low = 0, high = height.length - 1, MaxArea = 0;

        while (low < high) {
            int h = Math.min(height[low], height[high]);
            int area = h * (high - low);
            MaxArea = Math.max(area, MaxArea);
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return MaxArea;
    }
}